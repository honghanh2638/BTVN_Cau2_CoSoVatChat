package cau2;


/**
 * @author hongh
 * @version 1.0
 * @created 07-Thg9-2025 9:38:06 CH
 */
public abstract class CoSoVatChat {

	protected ChatLieu chatLieu;
	protected KichCo kichCo;
	protected String ma;
	protected int soChan;
	public ChatLieu m_ChatLieu;

	public CoSoVatChat(){

	}

	public void finalize() throws Throwable {

	}
	public abstract double canNang();

	public ChatLieu getChatLieu(){
		return null;
	}

	/**
	 * 
	 * @param kichCo
	 */
	public kichCo getKichCo(kichCo){
		return null;
	}

	public String getMa(){
		return "";
	}

	public int getSoChan(){
		return 0;
	}

	/**
	 * 
	 * @param chatLieu
	 */
	public setChatLieu(ChatLieu chatLieu){

	}

	/**
	 * 
	 * @param kichCo
	 */
	public setKichCo(KichCo kichCo){

	}

	/**
	 * 
	 * @param ma
	 */
	public setMa(String ma){

	}

	/**
	 * 
	 * @param soChan
	 */
	public setSoChan(int soChan){

	}
}//end CoSoVatChat