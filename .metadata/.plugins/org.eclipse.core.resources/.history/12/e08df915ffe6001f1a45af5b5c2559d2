package com.nvminh162.Hibernate01.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class NhanVien {
	@Id
	private String id;
	private String hoVanTen;
	private Date ngaySinh;
	@ManyToMany(mappedBy = "dsNV")
	private Set<CuocHop> dsCH = new HashSet<CuocHop>();

	public NhanVien() {}

	public NhanVien(String id, String hoVanTen, Date ngaySinh) {
		this.id = id;
		this.hoVanTen = hoVanTen;
		this.ngaySinh = ngaySinh;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHoVanTen() {
		return hoVanTen;
	}

	public void setHoVanTen(String hoVanTen) {
		this.hoVanTen = hoVanTen;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	@Override
	public String toString() {
		return "NhanVien [id=" + id + ", hoVanTen=" + hoVanTen + ", ngaySinh=" + ngaySinh + "]";
	}
}