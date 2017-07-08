package org.sunbird.common.responsecode;

/**
 * This interface will hold all the response key and message
 * @author Manzarul
 *
 */
public interface ResponseMessage {
	public interface Message {
		public static final String UNAUTHORISE_USER = "You are not authorise.";
		public static final String INVALID_USER_CREDENTIALS = "Please check your credentials";
		public static final String INVALID_OPERATION_NAME = "Operation name is invalid.Please provide a valid operation name";
		public static final String INVALID_REQUESTED_DATA = "Requested data for this operation is not valid.";
		public static final String COMSUMER_ID_MISSING_ERROR = "Consumer id is mandatory.";
		public static final String COMSUMER_ID_INVALID_ERROR = "Consumer id is invalid.";
		public static final String DEVICE_ID_MISSING_ERROR = "Device id is mandatory.";
		public static final String CONTENT_ID_INVALID_ERROR = "Please provide a valid content id.";
		public static final String CONTENT_ID_MISSING_ERROR = "Please provide content id.";
		public static final String COURSE_ID_MISSING_ERROR = "Please provide course id.";
		public static final String API_KEY_MISSING_ERROR = "APi key is mandatory.";
		public static final String API_KEY_INVALID_ERROR = "APi key is invalid.";
		public static final String INTERNAL_ERROR = "Process failed,please try after some time.";
		public static final String COURSE_NAME_MISSING = "Please provide the course name.";
		public static final String SUCCESS_MESSAGE = "Success";
		public static final String SESSION_ID_MISSING = "Session id is mandatory.";
		public static final String COURSE_ID_MISSING = "Course id is mandatory.";
		public static final String CONTENT_ID_MISSING = "Content id is mandatory.";
		public static final String VERSION_MISSING = "Version is mandatory.";
		public static final String COURSE_VERSION_MISSING = "Course version is mandatory.";
		public static final String CONTENT_VERSION_MISSING = "Content version is mandatory.";
		public static final String COURSE_DESCRIPTION_MISSING = "Description is mandatory.";
		public static final String COURSE_TOCURL_MISSING = "Course tocurl is mandatory.";
		public static final String EMAIL_MISSING = "Email is mandatory.";
		public static final String EMAIL_FORMAT = "Email is invalid.";
		public static final String FIRST_NAME_MISSING = "First name is mandatory.";
		public static final String LANGUAGE_MISSING = "Language is mandatory.";
		public static final String PASSWORD_MISSING = "Password is mandatory.";
		public static final String PASSWORD_MIN_LENGHT = "Password should have at least 8 character.";
		public static final String PASSWORD_MAX_LENGHT = "Password should not be more than 12 character.";
		public static final String ORGANISATION_ID_MISSING = "Organisation id is mandatory.";
		public static final String ORGANISATION_NAME_MISSING = "organisation name is mandatory.";
		public static final String ENROLLMENT_START_DATE_MISSING = "Enrollment start date is mandatory.";
		public static final String COURSE_DURATION_MISSING = "Course duration is mandatory.";
		public static final String LOGIN_TYPE_MISSING = "Login type is required.";
		public static final String EMAIL_IN_USE = "Email already exists.";
		public static final String USERNAME_EMAIL_IN_USE = "Username or Email already exists.";
		public static final String KEY_CLOAK_DEFAULT_ERROR = "server error at sso.";
		public static final String USER_REG_UNSUCCESSFULL = "User Registration unsuccessfull.";
		public static final String USER_UPDATE_UNSUCCESSFULL = "User update operation is unsuccessfull.";
		public static final String INVALID_CREDENTIAL = "Invalid credential.";
		public static final String USERNAME_MISSING = "Username is mandatory.";
		public static final String USERNAME_IN_USE = "Username already exists.";
		public static final String USERID_MISSING = "UserId is mandatory.";
		public static final String MESSAGE_ID_MISSING = "Message id is mandatory.";
		public static final String USERNAME_CANNOT_BE_UPDATED = "UserName cann't be updated.";
		public static final String AUTH_TOKEN_MISSING = "Auth token is mandatory.";
		public static final String INVALID_AUTH_TOKEN = "Auth token is invalid.Please login again.";
		public static final String TIMESTAMP_REQUIRED = "TimeStamp is required.";
		public static final String PUBLISHED_COURSE_CAN_NOT_UPDATED ="Published course can't be updated.";
		public static final String SOURCE_MISSING = "Source is required.";
		public static final String SECTION_NAME_MISSING = "Section name is required.";
		public static final String SECTION_DATA_TYPE_MISSING = "Section data type missing.";
		public static final String SECTION_ID_REQUIRED = "Section id is required.";
		public static final String PAGE_NAME_REQUIRED = "Page name is required.";
		public static final String PAGE_ID_REQUIRED = "Page id is required.";
		public static final String INVALID_CONFIGURATION ="Invalid configuration data.";
		public static final String ASSESSMENT_ITEM_ID_REQUIRED = "Assessment item id is required.";
		public static final String ASSESSMENT_TYPE_REQUIRED = "Assessment type is required.";
		public static final String ATTEMPTED_DATE_REQUIRED = "Attempted data is required.";
		public static final String ATTEMPTED_ANSWERS_REQUIRED = "Attempted answers is required.";
		public static final String MAX_SCORE_REQUIRED = "Max score is required.";
		public static final String STATUS_CANNOT_BE_UPDATED = "status cann't be updated.";
		public static final String ATTEMPT_ID_MISSING_ERROR = "Please provide attempt id.";
		public static final String LOGIN_TYPE_ERROR = "provide login type as null.";
		public static final String INVALID_ORG_ID ="Org id does not exist .";
		public static final String INVALID_ORG_STATUS = "Invalid org status for approve .";
		public static final String INVALID_ORG_STATUS_TRANSITION = "Can not change state of Org to requeted state .";
		public static final String ADDRESS_REQUIRED_ERROR = "Please provide address.";
		public static final String EDUCATION_REQUIRED_ERROR = "Please provide education details.";
		public static final String JOBDETAILS_REQUIRED_ERROR = "Please provide job details.";
		public static final String DB_INSERTION_FAIL = "DB insert operation failed.";
		public static final String DB_UPDATE_FAIL = "Db update operation failed.";
		public static final String DATA_ALREADY_EXIST = "data already exist.";
		public static final String INVALID_DATA = "INcorrect data.";
		public static final String INVALID_COURSE_ID = "Course doesnot exist. Please provide a valid course identifier";
		public static final String PHONE_NO_REQUIRED_ERROR = "Phone number is required.";
		public static final String ORG_ID_MISSING ="Organisation Id required .";
	}

	public interface Key {
		public static final String UNAUTHORISE_USER = "UNAUTHORISE_USER";
		public static final String INVALID_USER_CREDENTIALS = "INVALID_USER_CREDENTIALS";
		public static final String INVALID_OPERATION_NAME = "INVALID_OPERATION_NAME";
		public static final String INVALID_REQUESTED_DATA = "INVALID_REQUESTED_DATA";
		public static final String COMSUMER_ID_MISSING_ERROR = "COMSUMER_ID_REQUIRED_ERROR";
		public static final String COMSUMER_ID_INVALID_ERROR = "COMSUMER_ID_INVALID_ERROR";
		public static final String DEVICE_ID_MISSING_ERROR = "DEVICE_ID_REQUIRED_ERROR";
		public static final String CONTENT_ID_INVALID_ERROR = "CONTENT_ID_INVALID_ERROR";
		public static final String CONTENT_ID_MISSING_ERROR = "CONTENT_ID_REQUIRED_ERROR";
		public static final String COURSE_ID_MISSING_ERROR = "COURSE_ID_REQUIRED_ERROR";
		public static final String API_KEY_MISSING_ERROR = "API_KEY_REQUIRED_ERROR";
		public static final String API_KEY_INVALID_ERROR = "API_KEY_INVALID_ERROR";
		public static final String INTERNAL_ERROR = "API_KEY_INVALID_ERROR";
		public static final String COURSE_NAME_MISSING = "COURSE_NAME_REQUIRED_ERROR";
		public static final String SUCCESS_MESSAGE = "SUCCESS";
		public static final String SESSION_ID_MISSING = "SESSION_ID_REQUIRED_ERROR";
		public static final String COURSE_ID_MISSING = "COURSE_ID_REQUIRED_ERROR";
		public static final String CONTENT_ID_MISSING ="CONTENT_ID_REQUIRED_ERROR";
		public static final String VERSION_MISSING ="VERSION_REQUIRED_ERROR";
		public static final String COURSE_VERSION_MISSING ="COURSE_VERSION_REQUIRED_ERROR";
		public static final String CONTENT_VERSION_MISSING ="CONTENT_VERSION_REQUIRED_ERROR";
		public static final String COURSE_DESCRIPTION_MISSING = "COURSE_DESCRIPTION_REQUIRED_ERROR";
		public static final String COURSE_TOCURL_MISSING = "COURSE_TOCURL_REQUIRED_ERROR";
		public static final String EMAIL_MISSING = "EMAIL_ID_REQUIRED_ERROR";
		public static final String EMAIL_FORMAT = "EMAIL_FORMAT_ERROR";
		public static final String FIRST_NAME_MISSING = "FIRST_NAME_REQUIRED_ERROR";
		public static final String LANGUAGE_MISSING = "LANGUAGE_REQUIRED_ERROR";
		public static final String PASSWORD_MISSING = "PASSWORD_REQUIRED_ERROR";
		public static final String PASSWORD_MIN_LENGHT = "PASSWORD_MIN_LENGHT_ERROR";
		public static final String PASSWORD_MAX_LENGHT = "PASSWORD_MAX_LENGHT_ERROR";
		public static final String ORGANISATION_ID_MISSING = "ORGANISATION_ID_MISSING";
		public static final String ORGANISATION_NAME_MISSING = "ORGANISATION_NAME_MISSING";
		public static final String ENROLLMENT_START_DATE_MISSING = "ENROLLMENT_START_DATE_MISSING";
		public static final String COURSE_DURATION_MISSING = "COURSE_DURATION_MISSING";
		public static final String LOGIN_TYPE_MISSING = "LOGIN_TYPE_MISSING";
		public static final String EMAIL_IN_USE = "EMAIL_IN_USE";
		public static final String USERNAME_EMAIL_IN_USE = "USERNAME_EMAIL_IN_USE";
		public static final String KEY_CLOAK_DEFAULT_ERROR = "KEY_CLOAK_DEFAULT_ERROR";
		public static final String USER_REG_UNSUCCESSFULL = "USER_REG_UNSUCCESSFULL";
		public static final String USER_UPDATE_UNSUCCESSFULL = "USER_UPDATE_UNSUCCESSFULL";
		public static final String INVALID_CREDENTIAL = "INVALID_CREDENTIAL";
		public static final String USERNAME_MISSING = "USERNAME_MISSING";
		public static final String USERNAME_IN_USE = "USERNAME_IN_USE";
		public static final String USERID_MISSING = "USERID_MISSING";
		public static final String MESSAGE_ID_MISSING = "MESSAGE_ID_MISSING";
		public static final String USERNAME_CANNOT_BE_UPDATED = "USERNAME_CANNOT_BE_UPDATED";
		public static final String AUTH_TOKEN_MISSING = "X_Authenticated_Userid_MISSING";
		public static final String INVALID_AUTH_TOKEN = "INVALID_AUTH_TOKEN";
		public static final String TIMESTAMP_REQUIRED = "TIMESTAMP_REQUIRED";
		public static final String PUBLISHED_COURSE_CAN_NOT_UPDATED = "PUBLISHED_COURSE_CAN_NOT_UPDATED";
		public static final String SOURCE_MISSING = "SOURCE_MISSING";
		public static final String SECTION_NAME_MISSING = "SECTION_NAME_MISSING";
		public static final String SECTION_DATA_TYPE_MISSING = "SECTION_DATA_TYPE_MISSING";
		public static final String SECTION_ID_REQUIRED = "SECTION_ID_REQUIRED";
		public static final String PAGE_NAME_REQUIRED = "PAGE_NAME_REQUIRED";
		public static final String PAGE_ID_REQUIRED = "PAGE_ID_REQUIRED";
		public static final String INVALID_CONFIGURATION ="INVALID_CONFIGURATION";
		public static final String ASSESSMENT_ITEM_ID_REQUIRED = "ASSESSMENT_ITEM_ID_REQUIRED";
		public static final String ASSESSMENT_TYPE_REQUIRED = "ASSESSMENT_TYPE_REQUIRED";
		public static final String ATTEMPTED_DATE_REQUIRED = "ATTEMPTED_DATE_REQUIRED";
		public static final String ATTEMPTED_ANSWERS_REQUIRED = "ATTEMPTED_ANSWERS_REQUIRED";
		public static final String MAX_SCORE_REQUIRED = "MAX_SCORE_REQUIRED";
		public static final String STATUS_CANNOT_BE_UPDATED = "STATUS_CANNOT_BE_UPDATED";
		public static final String ATTEMPT_ID_MISSING_ERROR = "ATTEMPT_ID_REQUIRED_ERROR";
		public static final String LOGIN_TYPE_ERROR = "LOGIN_TYPE_ERROR";
		public static final String INVALID_ORG_ID = "INVALID_ORG_ID";
		public static final String INVALID_ORG_STATUS = "INVALID_ORG_STATUS";
		public static final String INVALID_ORG_STATUS_TRANSITION = "INVALID_ORG_STATUS_TRANSITION";
		public static final String ADDRESS_REQUIRED_ERROR = "ADDRESS_REQUIRED_ERROR";
		public static final String EDUCATION_REQUIRED_ERROR = "EDUCATION_REQUIRED_ERROR";
		public static final String JOBDETAILS_REQUIRED_ERROR = "JOBDETAILS_REQUIRED_ERROR";
		public static final String DB_INSERTION_FAIL = "DB_INSERTION_FAIL";
		public static final String DB_UPDATE_FAIL = "DB_UPDATE_FAIL";
		public static final String DATA_ALREADY_EXIST = "DATA_ALREADY_EXIST";
		public static final String INVALID_DATA = "INVALID_DATA";
		public static final String INVALID_COURSE_ID = "INVALID_COURSE_ID";
		public static final String PHONE_NO_REQUIRED_ERROR = "PHONE_NO_REQUIRED_ERROR";
		public static final String ORG_ID_MISSING = "ORG_ID_MISSING";
	}
}

