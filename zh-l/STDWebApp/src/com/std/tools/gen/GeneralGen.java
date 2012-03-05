package com.std.tools.gen;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;
import java.util.Map;

import com.std.tools.gen.data.AbstractTemplateData;
import com.std.utils.freemarker.FromCamelToUnderscore;
import com.std.utils.freemarker.FromUnderscoreToCamel;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class GeneralGen {
    protected static final String PATH_TEMPLATE = "com/std/tools/gen/template";
    private AbstractTemplateData  templateData;
    private String                subProjDir;

    public GeneralGen(AbstractTemplateData templateData, String subProjDir) throws Exception {
        if (templateData == null || subProjDir == null || subProjDir.equals(""))
            throw new RuntimeException("参数不能为空！");
        this.templateData = templateData;
        this.subProjDir = subProjDir;
    }

    /**
     * @param templateData
     *            default subProjDir is base
     */
    public GeneralGen(AbstractTemplateData templateData) {
        this.templateData = templateData;
        this.subProjDir = "base";
    }

    public String genDataObject() throws IOException, TemplateException {
        return genResult(templateData.getTemplateDataMap(), subProjDir, "DataObject.ftl");
    }

    public String genDao() throws IOException, TemplateException {
        return genResult(templateData.getTemplateDataMap(), subProjDir, "Dao.ftl");
    }

    public String genDaoImpl() throws IOException, TemplateException {
        return genResult(templateData.getTemplateDataMap(), subProjDir, "DaoImpl.ftl");
    }

    public String genService() throws IOException, TemplateException {
        return genResult(templateData.getTemplateDataMap(), subProjDir, "service.ftl");
    }

    public String genServiceImpl() throws IOException, TemplateException {
        return genResult(templateData.getTemplateDataMap(), subProjDir, "ServiceImpl.ftl");
    }

    public String genSqlMap() throws IOException, TemplateException {
        return genResult(templateData.getTemplateDataMap(), subProjDir, "sql.ftl");
    }

    /**
     * 由模板生成结果
     *
     * @param parametersMap
     *            参数对象
     * @param subPathAndName
     *            子路径和模板文件
     * @throws IOException
     * @throws TemplateException
     */
    private String genResult(Map<String, Object> parametersMap, String subPath, String fliename)
                                                                                                throws IOException,
                                                                                                TemplateException {
        Configuration cfg = new Configuration();
        if (subPath != null && !subPath.isEmpty()) {
            cfg.setDirectoryForTemplateLoading(new File(GeneralGen.class.getClassLoader().getResource(PATH_TEMPLATE + "/" + subPath).getFile()));
        } else {
            cfg.setDirectoryForTemplateLoading(new File(GeneralGen.class.getClassLoader().getResource(PATH_TEMPLATE).getFile()));
        }
        cfg.setEncoding(Locale.CHINA, "utf-8");
        cfg.setSharedVariable("toCmael", new FromUnderscoreToCamel());
        cfg.setSharedVariable("toUnderscore", new FromCamelToUnderscore());
        Template template = cfg.getTemplate(fliename);
        StringWriter sWriter = new StringWriter();
        template.process(parametersMap, sWriter);
        sWriter.flush();
        return sWriter.getBuffer().toString();
    }

    public void genResultFile() {
    }

    public void systemOutAll() throws IOException, TemplateException {
        System.out.println("===DataObject===");
        System.out.println(this.genDataObject());
        System.out.println("===Dao===");
        System.out.println(this.genDao());
        System.out.println("===DaoImpl===");
        System.out.println(this.genDaoImpl());
        System.out.println("===Service===");
        System.out.println(this.genService());
        System.out.println("===ServiceImpl===");
        System.out.println(this.genServiceImpl());
        System.out.println("===SqlMap===");
        System.out.println(this.genSqlMap());
    }
}
