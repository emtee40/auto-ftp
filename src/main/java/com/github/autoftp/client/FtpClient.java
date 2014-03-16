package com.github.autoftp.client;

import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTPClient;

import com.github.autoftp.connection.Connection;

public class FtpClient extends Client {
	
	private FTPClient ftpClient;
	
	public FtpClient() {
		this.ftpClient = new FTPClient();
	}
	
	public Connection connect() {
		
		try {
			this.ftpClient.connect(host);
		}
		catch (SocketException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
		
		return null;
	}

	public void disconnect() {
		
		try {
			this.ftpClient.disconnect();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
