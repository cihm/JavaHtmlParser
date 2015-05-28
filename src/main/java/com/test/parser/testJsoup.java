package com.test.parser;

import java.net.URL;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class testJsoup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //online parser 
		//http://try.jsoup.org/~LGB7rk_atM2roavV0d-czMt3J_g
		try{
			
			Document doc = Jsoup.connect("http://en.wikipedia.org/").get();
			Elements newsHeadlines = doc.select("#mp-itn b a");
			// Get first table

			Element table = doc.select("table").first();
			// Get td Iterator
			Iterator<Element> ite = table.select("td").iterator();
			// Print content
			int cnt = 0;
			while (ite.hasNext()) {
				cnt++;
				System.out.println("Value " + cnt + ": " + ite.next().text());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
         
	}

}
