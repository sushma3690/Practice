package DesignPat.struct.proxy;

public class MediaFileImpl implements MediaFile {
	String fileName;
	
	MediaFileImpl(String fileName){
		this.fileName = fileName;
		downLoadFromDisk(this.fileName);
	}

	private void downLoadFromDisk(String fileName2) {
		System.out.println(" downloading from disk "+ fileName2);
	}

	@Override
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println(" file name contents of "+ this.fileName);
	}

}
