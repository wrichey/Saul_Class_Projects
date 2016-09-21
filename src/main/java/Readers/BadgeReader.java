package Readers;
<<<<<<< HEAD:src/main/java/BadgeReader.java

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BadgeReader  {
=======

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BadgeReader {
>>>>>>> 6520e02cdd1190574752421658de3489594be4ae:src/main/java/Readers/BadgeReader.java
	public List<String> badges;
	// int currentBadge;
	
	public BadgeReader(String dataFile) {
        badges = new ArrayList<String>();
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(dataFile)));

	        String str;
	        while ((str = br.readLine()) != null) {
	            badges.add(str);
	        }

	        br.close();
		}catch (Exception e) {}
	}

}