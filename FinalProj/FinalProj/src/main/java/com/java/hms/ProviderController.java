package com.java.hms;

public class ProviderController {
	private Provider provider;
	private ProviderDAOImpl daoImpl;
	
	public Provider getProvider() {
		return provider;
	}
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	public ProviderDAOImpl getDaoImpl() {
		return daoImpl;
	}
	public void setDaoImpl(ProviderDAOImpl daoImpl) {
		this.daoImpl = daoImpl;
	}
	
//	public String SearchProvider() {
//		if (addValid()) {
//				return daoImpl.getIdLists(providerId);
//		}
//		return "";
//	}
	private boolean addValid() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
