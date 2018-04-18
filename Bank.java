import java.awt;
import javax.imageio.event;

public class Bank{
	private long id;
	private int jumlahNasabah;
	private String jumlahCabang;
	private String[] namaNasabah;

	private ArrayList<String> alamatNasabah;

	public Bank(){
		this.id = 0;
		this.jumlahBank = "0";
		this.jumlahNasabah = 10;
		this.namaNasabah = new String[this.jumlahNasabah];
	}

	public void tambahcabang(int a){
		jumlahBank = "" + a ; 
	}

	public void tambahNasabah(String nasabah){
		for(int i = 0; i < namaNasabah.size(); i++){
			if(namaNasabah[i] == null){
				namaNasabah[i] = namaNasabah;
			}
		}
	}

	public String getNamaNasabah(int idNasabah){
		return namaNasabah[idNasabah];
	}
}