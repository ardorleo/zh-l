package com.std.test;

import java.io.StringReader;

public class TestSringReader {

	public static void main(String [] args){
		String testStr="\r\n"+
		"\r\n"+
		"create table dwd_rel_chg_rev_share_message_{yyyymmdd}\r\n"+
		"(\r\n"+
		" id numeric(11),\r\n"+
		" message_code char(6),\r\n"+
		" trans_date char(8),\r\n"+
		" month char(6),\r\n"+
		" share_card_no varchar(30),\r\n"+
		" own_account_no varchar(64),\r\n"+
		" amount numeric(15),\r\n"+
		" order_link_id numeric(11),\r\n"+
		" bill_type varchar(10),\r\n"+
		" merchant_id numeric(11),\r\n"+
		" bill_status varchar(10),\r\n"+
		" settle_type varchar(10),\r\n"+
		" product_name varchar(64),\r\n"+
		" gmt_create timestamp(0),\r\n"+
		" bill_id numeric(11),\r\n"+
		" gp_amount numeric(15),\r\n"+
		" verbuchung_date char(8)\r\n"+
		")\r\n";

		StringReader strReader=new StringReader(testStr.toUpperCase());
		System.out.println(strReader);

	}
}
