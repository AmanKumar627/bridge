package com.bridge;

import java.io.File;
import java.util.ArrayList;

public interface AddressBook {
	//ArrayList<Object> createAddressBook(String filename);

	public void create();

	void open();

	void save();

	void saveAs();

	void quit();

}
