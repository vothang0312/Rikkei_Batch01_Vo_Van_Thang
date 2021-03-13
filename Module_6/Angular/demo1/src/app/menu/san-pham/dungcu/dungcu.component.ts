import { Component, OnInit } from '@angular/core';
import {ISDoChoi, ISDungCu} from "../dbsanpham";

@Component({
  selector: 'app-dungcu',
  templateUrl: './dungcu.component.html',
  styleUrls: ['./dungcu.component.css']
})
export class DungcuComponent implements OnInit {

  dungcus:ISDungCu[]=[
    {maSP:'DC-0001',tenSP:'AWM',soLuong:3,donGia:250000,donVi:'Khẩu',maDanhMucDoChoi:'1',xuatXu:'JAV',thuongHieu:'OneShot',
      nhaCungCap:'Toriyama Akira',mauSac:'Red',kichThuoc:'100cm',chatLieu:'Sắt',huongDan:'OneShotOneKill'},
    {maSP:'DC-0002',tenSP:'Kar98',soLuong:4,donGia:200000,donVi:'Khẩu',maDanhMucDoChoi:'1',xuatXu:'JAV',thuongHieu:'TwoShot',
      nhaCungCap:'Toriyama Akira',mauSac:'Red',kichThuoc:'100cm',chatLieu:'Sắt',huongDan:'TwoShotOneKill'},
    {maSP:'DC-0003',tenSP:'M24',soLuong:3,donGia:280000,donVi:'Khẩu',maDanhMucDoChoi:'1',xuatXu:'JAV',thuongHieu:'TwoShot',
      nhaCungCap:'Toriyama Akira',mauSac:'Red',kichThuoc:'100cm',chatLieu:'Sắt',huongDan:'TwoShotOneKill'},

  ]

  constructor() { }

  ngOnInit(): void {
  }

}
