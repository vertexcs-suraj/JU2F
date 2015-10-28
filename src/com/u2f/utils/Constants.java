package com.u2f.utils;

public interface Constants {

	public static final String API_ENDPOINT="https://u2fval.appspot.com/api";
	public static final String APP_ID="https://u2f.pseudobinary.com";
	//#TODO remove hardcoded API Token and read from file at runtime.
	public static final String API_TOKEN="4012786652eafde41ff1b66f7493bda82d3ff370cb419d4e2d1c47746637ab36";
	
	public static enum U2F_VERSIONS{
		U2F_V1,
		U2F_V2;
		@Override
		public String toString(){
			if(this.equals(U2F_V1))
				return "U2F_V1";
			else
				return "U2F_V2";
		}
	}
	
	public static enum REQUEST_TYPE{
		REGISTER,
		SIGN;
		@Override
		public String toString() {
			if(this.equals(REGISTER))
				return "u2f_register_request";
			else
				return "u2f_sign_request";
		}
	}
	
	public static enum RESPONSE_TYPE{
		REGISTER,
		SIGN;
		@Override
		public String toString() {
			if(this.equals(REGISTER))
				return "u2f_register_response";
			else
				return "u2f_sign_response";
		}
	}
}
