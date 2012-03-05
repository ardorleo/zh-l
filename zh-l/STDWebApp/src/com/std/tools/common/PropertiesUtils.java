package com.std.tools.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 *
 * @author ardorleo 修改日期：2011-11-12
 */
public class PropertiesUtils {

	private static Logger logger = LogManager.getLogger(PropertiesUtils.class);

	private static String INIT_ERROR_MESSAGE = "装载配置文件失败!";
	private static String FILE_NOT_EXIST_MESSAGE = "配置文件不存在!";

	private File configFile;
	private long fileLastModified = 0L;
	private Properties props = null;

	private PropertiesUtils() {

	}

	/**
	 * 获取参数对象 配置文件，需要有完整的相对路径，相对于class的根路径<br>
	 * 例如：com/std/tools/gen/profiles/Datashare2Gen.properties
	 *
	 * @return
	 * @throws IOException
	 */
	public static PropertiesUtils initProps(String propertiesFileName)
			throws IOException {
		PropertiesUtils propsUtil = new PropertiesUtils();
		propsUtil.props = new Properties();
		URL url = PropertiesUtils.class.getClassLoader().getResource(propertiesFileName);
		if (url == null) {
			logger.error(FILE_NOT_EXIST_MESSAGE);
			System.exit(0);
		}
		propsUtil.configFile = new File(url.getFile());
		try {
			propsUtil.props.load(new FileInputStream(propsUtil.configFile));
		} catch (Exception e) {
			logger.error(INIT_ERROR_MESSAGE, e);
			System.exit(0);
		}
		propsUtil.fileLastModified = propsUtil.configFile.lastModified();
		propsUtil.props.load(new FileInputStream(propsUtil.configFile));

		return propsUtil;
	}

	public String getValue(String key) {
		String value = null;
		try {
			monitorPropertiesChanged();
			value = this.props.getProperty(key);
		} catch (Exception e) {
			logger.error("获取" + key + "失败！", e);
		}
		return value;
	}

	private void monitorPropertiesChanged() {
		if (this.configFile.lastModified() > this.fileLastModified) {
			try {
				this.props.load(new FileInputStream(this.configFile));
				fileLastModified = configFile.lastModified();
			} catch (IOException e) {
				logger.error("装载配置文件失败", e);
			}
		}
	}
}
