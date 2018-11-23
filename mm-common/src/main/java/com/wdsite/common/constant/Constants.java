package com.wdsite.common.constant;

public interface Constants {
	
	public static final Boolean ACCOUNT_AVAILABLE = true; //账号可用
	
	public static final Boolean ACCOUNT_DISABLE = false; //账号不可用
	
	public static final Boolean REMOVED = true; //信息已删除

	public static final Boolean NOT_REMOVED = false; //信息未删除

	public static final int BYTE_BUFFER = 1024;

	public static final int BUFFER_MULTIPLE = 10;

	// 根菜单节点
	public static final String ROOT_MENU = "0";

	// 可用
//	public static final boolean AVAILABLE = true;
	
	public static class FilePostFix {
		public static final String ZIP_FILE = ".zip";

		public static final String[] IMAGES = { "jpg", "jpeg", "JPG", "JPEG", "gif", "GIF", "bmp", "BMP", "png" };
		public static final String[] ZIP = { "ZIP", "zip", "rar", "RAR" };
		public static final String[] VIDEO = { "mp4", "MP4", "mpg", "mpe", "mpa", "m15", "m1v", "mp2", "rmvb" };
		public static final String[] APK = { "apk", "exe" };
		public static final String[] OFFICE = { "xls", "xlsx", "docx", "doc", "ppt", "pptx" };

	}

	public static class FileType {
		public static final int FILE_IMG = 1;
		public static final int FILE_ZIP = 2;
		public static final int FILE_VEDIO = 3;
		public static final int FILE_APK = 4;
		public static final int FIVE_OFFICE = 5;
		public static final String FILE_IMG_DIR = "/img/";
		public static final String FILE_ZIP_DIR = "/zip/";
		public static final String FILE_VEDIO_DIR = "/video/";
		public static final String FILE_APK_DIR = "/apk/";
		public static final String FIVE_OFFICE_DIR = "/office/";
	}



}
