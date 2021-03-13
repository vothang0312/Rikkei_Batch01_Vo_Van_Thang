import { Component, OnInit } from '@angular/core';
import {ISDoChoi} from "../../dbsanpham";

@Component({
  selector: 'app-listdochoi',
  templateUrl: './listdochoi.component.html',
  styleUrls: ['./listdochoi.component.css']
})
export class ListdochoiComponent implements OnInit {

  dochois:ISDoChoi[]=[
    {maSP:'DC-0001',tenSP:'AWM',soLuong:3,donGia:250000,donVi:'Khẩu',maDanhMucDoChoi:'1',xuatXu:'JAV',thuongHieu:'OneShot',nhaCungCap:'Toriyama Akira',huongDan:'OneShotOneKill'},
    {maSP:'DC-0002',tenSP:'Kar98',soLuong:4,donGia:200000,donVi:'Khẩu',maDanhMucDoChoi:'1',xuatXu:'JAV',thuongHieu:'TwoShot',nhaCungCap:'Toriyama Akira',huongDan:'TwoShotOneKill'},
    {maSP:'DC-0003',tenSP:'M24',soLuong:3,donGia:280000,donVi:'Khẩu',maDanhMucDoChoi:'1',xuatXu:'JAV',thuongHieu:'TwoShot',nhaCungCap:'Toriyama Akira',huongDan:'TwoShotOneKill'},

  ]
  constructor() { }

  ngOnInit(): void {
  }

}
