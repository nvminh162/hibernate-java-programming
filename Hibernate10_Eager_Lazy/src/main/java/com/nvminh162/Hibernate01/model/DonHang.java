package com.nvminh162.Hibernate01.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class DonHang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String tenKH;
	private Date ngayMua;
	@OneToMany(
		mappedBy = "donHang",
		cascade = CascadeType.ALL,
//		fetch = FetchType.EAGER //Load het các mqh
		fetch = FetchType.LAZY //chỉ load bản thân nó trc, khi nào cần get đến thì nó mới lấy
	)
	private List<ChiTietDonHang> dsCT = new ArrayList<ChiTietDonHang>();
	
	public DonHang() {}

	public DonHang(String tenKH, Date ngayMua) {
		this.tenKH = tenKH;
		this.ngayMua = ngayMua;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public Date getNgayMua() {
		return ngayMua;
	}

	public void setNgayMua(Date ngayMua) {
		this.ngayMua = ngayMua;
	}

	public List<ChiTietDonHang> getDsCT() {
		return dsCT;
	}

	public void setDsCT(List<ChiTietDonHang> dsCT) {
		this.dsCT = dsCT;
	}
	
	public void addCTDT(ChiTietDonHang ctdh) {
		this.dsCT.add(ctdh);
	}

	@Override
	public String toString() {
		return "DonHang [id=" + id + ", tenKH=" + tenKH + ", ngayMua=" + ngayMua + "]";
	}
}
