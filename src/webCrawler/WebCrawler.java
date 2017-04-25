package webCrawler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {
	
	private Queue<String> queue;
	private List<String> visitedUrl;
	
	public WebCrawler() {
		this.queue = new LinkedList<>();
		this.visitedUrl = new ArrayList<>();
	}
	
	public void discoverWeb(String root) {
		
		this.queue.add(root);
		this.visitedUrl.add(root);
		
		while( !queue.isEmpty()) {
			String v = this.queue.remove();
			String rawHtml = readURL(v);
			
			String regex = "http://(\\w+\\.)*(\\w+)";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(rawHtml);
			
			while(matcher.find()) {
				
				String actualUrl = matcher.group();
				
				if(!visitedUrl.contains(actualUrl)) {
					visitedUrl.add(actualUrl);
					System.out.println("website name :- " + actualUrl);
					queue.add(actualUrl);
				}
			}
		}
	}

	private String readURL(String v) {
		
		String rawHtml = "";
		
		try {
			URL url = new URL(v);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String inputText = "";
			
			while((inputText = br.readLine()) != null) {
				rawHtml += inputText;
			}
			
			br.close();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rawHtml;
	}
	
	

}
