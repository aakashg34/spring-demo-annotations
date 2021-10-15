package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private String fileName = "";
	private List<String> theFortunes;
	
	private Random myRandom;
	
	//random number generator
	public FileFortuneService() {
		File theFile = new File(fileName);
		System.out.println("Reading contents from the file" +theFile);
		
		System.out.println("File exists: " +theFile.exists());
		
		theFortunes = new ArrayList<String>();
		
		//read the contents of the file
		
		try(BufferedReader br = new BufferedReader(new FileReader(theFile))){
			
			String tempLine;
			while((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		
	}
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index = myRandom.nextInt(theFortunes.size());
		
		String temp = theFortunes.get(index);
		
		
		
		return temp;
	}

}
