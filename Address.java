package com.bridge;

public class Address {
	private String CityName;
	private String StateNmae;
	private long PinCode;
	private long PhoneNumber;

	public String getCityName() {
		return CityName;
	}

	public void setCityName(String cityName) {
		CityName = cityName;
	}

	public String getStateNmae() {
		return StateNmae;
	}

	public void setStateNmae(String stateNmae) {
		StateNmae = stateNmae;
	}

	public long getPinCode() {
		return PinCode;
	}

	public void setPinCode(long pinCode) {
		PinCode = pinCode;
	}

	public long getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Address [CityName=" + CityName + ", StateNmae=" + StateNmae + ", PinCode=" + PinCode + ", PhoneNumber="
				+ PhoneNumber + "]";
	}
	

}
