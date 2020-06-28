package DesignPat.struct.proxy;

public class ProxyMediaImpl implements MediaFile{
	MediaFileImpl mediaImpl;
	String fileName;
	
	ProxyMediaImpl(String fileName){
		this.fileName = fileName;
		if(mediaImpl == null) {
			mediaImpl = new MediaFileImpl(fileName);
		}
	}

	@Override
	public void printName() {
		// TODO Auto-generated method stub
		mediaImpl.printName();
		
	}

}
