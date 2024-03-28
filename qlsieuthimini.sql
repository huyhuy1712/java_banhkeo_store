-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th3 28, 2024 lúc 04:24 PM
-- Phiên bản máy phục vụ: 10.4.32-MariaDB
-- Phiên bản PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qlsieuthimini`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietchuongtrinhgiamgia`
--

CREATE TABLE `chitietchuongtrinhgiamgia` (
  `idChiTietChuongTrinhGiamGia` int(11) NOT NULL,
  `loaiGiam` int(11) DEFAULT NULL,
  `soTienGiam` int(11) DEFAULT NULL,
  `idChuongTrinh` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `chitietchuongtrinhgiamgia`
--

INSERT INTO `chitietchuongtrinhgiamgia` (`idChiTietChuongTrinhGiamGia`, `loaiGiam`, `soTienGiam`, `idChuongTrinh`) VALUES
(1, 1, 10000, 1),
(2, 2, 0, 1),
(3, 1, 20000, 2),
(4, 2, 0, 2),
(5, 1, 15000, 3),
(6, 2, 0, 3),
(7, 1, 30000, 4),
(8, 2, 0, 4),
(9, 1, 25000, 5),
(10, 2, 0, 5);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitiethoadon`
--

CREATE TABLE `chitiethoadon` (
  `idChiTietHoaDon` int(11) NOT NULL,
  `donGia` int(11) DEFAULT NULL,
  `soLuong` int(11) DEFAULT NULL,
  `thanhTien` int(11) DEFAULT NULL,
  `idHoaDon` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `chitiethoadon`
--

INSERT INTO `chitiethoadon` (`idChiTietHoaDon`, `donGia`, `soLuong`, `thanhTien`, `idHoaDon`) VALUES
(1, 50000, 10, 500000, 1),
(2, 60000, 5, 300000, 1),
(3, 55000, 8, 440000, 2),
(4, 70000, 12, 840000, 2),
(5, 60000, 7, 420000, 3),
(6, 50000, 9, 450000, 3),
(7, 70000, 11, 770000, 4),
(8, 60000, 6, 360000, 4),
(9, 55000, 8, 440000, 5),
(10, 70000, 10, 700000, 5);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietphieunhap`
--

CREATE TABLE `chitietphieunhap` (
  `idChiTietPhieuNhap` int(11) NOT NULL,
  `soLuong` int(11) DEFAULT NULL,
  `donGiaSP` int(11) DEFAULT NULL,
  `thanhTien` int(11) DEFAULT NULL,
  `idPhieuNhap` int(11) DEFAULT NULL,
  `idSP` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `chitietphieunhap`
--

INSERT INTO `chitietphieunhap` (`idChiTietPhieuNhap`, `soLuong`, `donGiaSP`, `thanhTien`, `idPhieuNhap`, `idSP`) VALUES
(1, 10, 50000, 500000, 1, 1),
(2, 5, 60000, 300000, 1, 2),
(3, 8, 55000, 440000, 2, 3),
(4, 12, 70000, 840000, 2, 4),
(5, 7, 60000, 420000, 3, 5),
(6, 9, 50000, 450000, 3, 6),
(7, 11, 70000, 770000, 4, 7),
(8, 6, 60000, 360000, 4, 8),
(9, 8, 55000, 440000, 5, 9),
(10, 10, 70000, 700000, 5, 10);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietsp`
--

CREATE TABLE `chitietsp` (
  `idChiTietSP` int(11) NOT NULL,
  `doNgot` int(11) DEFAULT NULL,
  `hinhDang` varchar(50) DEFAULT NULL,
  `huong` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `chitietsp`
--

INSERT INTO `chitietsp` (`idChiTietSP`, `doNgot`, `hinhDang`, `huong`) VALUES
(1, 5, 'Hình dạng 1', 'Hương 1'),
(2, 3, 'Hình dạng 2', 'Hương 2'),
(3, 2, 'Hình dạng 3', 'Hương 3'),
(4, 4, 'Hình dạng 4', 'Hương 4'),
(5, 1, 'Hình dạng 5', 'Hương 5'),
(6, 3, 'Hình dạng 6', 'Hương 6'),
(7, 2, 'Hình dạng 7', 'Hương 7'),
(8, 4, 'Hình dạng 8', 'Hương 8'),
(9, 5, 'Hình dạng 9', 'Hương 9'),
(10, 2, 'Hình dạng 10', 'Hương 10');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chuongtrinhgiamgia`
--

CREATE TABLE `chuongtrinhgiamgia` (
  `idChuongTrinh` int(11) NOT NULL,
  `ten` varchar(255) DEFAULT NULL,
  `start` date DEFAULT NULL,
  `end` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `chuongtrinhgiamgia`
--

INSERT INTO `chuongtrinhgiamgia` (`idChuongTrinh`, `ten`, `start`, `end`) VALUES
(1, 'Chương trình 1', '2024-01-01', '2024-01-31'),
(2, 'Chương trình 2', '2024-02-01', '2024-02-29'),
(3, 'Chương trình 3', '2024-03-01', '2024-03-31'),
(4, 'Chương trình 4', '2024-04-01', '2024-04-30'),
(5, 'Chương trình 5', '2024-05-01', '2024-05-31'),
(6, 'Chương trình 6', '2024-06-01', '2024-06-30'),
(7, 'Chương trình 7', '2024-07-01', '2024-07-31'),
(8, 'Chương trình 8', '2024-08-01', '2024-08-31'),
(9, 'Chương trình 9', '2024-09-01', '2024-09-30'),
(10, 'Chương trình 10', '2024-10-01', '2024-10-31');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadon`
--

CREATE TABLE `hoadon` (
  `idHoaDon` int(11) NOT NULL,
  `tongTien` int(11) DEFAULT NULL,
  `tienGiamGia` int(11) DEFAULT NULL,
  `ngayLap` datetime DEFAULT NULL,
  `idNhanVien` int(11) DEFAULT NULL,
  `idKhachHang` int(11) DEFAULT NULL,
  `idChiTietChuongTrinhGiamGia` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `hoadon`
--

INSERT INTO `hoadon` (`idHoaDon`, `tongTien`, `tienGiamGia`, `ngayLap`, `idNhanVien`, `idKhachHang`, `idChiTietChuongTrinhGiamGia`) VALUES
(1, 500000, 0, '2024-01-01 10:00:00', 1, 1, 1),
(2, 600000, 20000, '2024-01-02 11:00:00', 2, 2, 2),
(3, 550000, 0, '2024-01-03 12:00:00', 3, 3, 3),
(4, 700000, 30000, '2024-01-04 13:00:00', 4, 4, 4),
(5, 600000, 0, '2024-01-05 14:00:00', 5, 5, 5),
(6, 500000, 0, '2024-01-06 15:00:00', 6, 6, 6),
(7, 700000, 40000, '2024-01-07 16:00:00', 7, 7, 7),
(8, 600000, 0, '2024-01-08 17:00:00', 8, 8, 8),
(9, 550000, 0, '2024-01-09 18:00:00', 9, 9, 9),
(10, 700000, 50000, '2024-01-10 19:00:00', 10, 10, 10);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khachhang`
--

CREATE TABLE `khachhang` (
  `idKhachHang` int(11) NOT NULL,
  `SDT` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `khachhang`
--

INSERT INTO `khachhang` (`idKhachHang`, `SDT`) VALUES
(1, '0123456789'),
(2, '0987654321'),
(3, '0123456789'),
(4, '0987654321'),
(5, '0123456789'),
(6, '0987654321'),
(7, '0123456789'),
(8, '0987654321'),
(9, '0123456789'),
(10, '0987654321');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loaisp`
--

CREATE TABLE `loaisp` (
  `idLoaiSP` int(11) NOT NULL,
  `tenLoaiSP` varchar(50) DEFAULT NULL,
  `dacTinh` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `loaisp`
--

INSERT INTO `loaisp` (`idLoaiSP`, `tenLoaiSP`, `dacTinh`) VALUES
(1, 'Loại sản phẩm 1', 'Đặc tính 1'),
(2, 'Loại sản phẩm 2', 'Đặc tính 2'),
(3, 'Loại sản phẩm 3', 'Đặc tính 3'),
(4, 'Loại sản phẩm 4', 'Đặc tính 4'),
(5, 'Loại sản phẩm 5', 'Đặc tính 5'),
(6, 'Loại sản phẩm 6', 'Đặc tính 6'),
(7, 'Loại sản phẩm 7', 'Đặc tính 7'),
(8, 'Loại sản phẩm 8', 'Đặc tính 8'),
(9, 'Loại sản phẩm 9', 'Đặc tính 9'),
(10, 'Loại sản phẩm 10', 'Đặc tính 10');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhacungcap`
--

CREATE TABLE `nhacungcap` (
  `idNhaCungCap` int(11) NOT NULL,
  `tenNCC` varchar(50) DEFAULT NULL,
  `diaChi` varchar(100) DEFAULT NULL,
  `sdt` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `nhacungcap`
--

INSERT INTO `nhacungcap` (`idNhaCungCap`, `tenNCC`, `diaChi`, `sdt`) VALUES
(1, 'Nhà cung cấp 1', 'Địa chỉ 1', '0123456789'),
(2, 'Nhà cung cấp 2', 'Địa chỉ 2', '0987654321'),
(3, 'Nhà cung cấp 3', 'Địa chỉ 3', '0123456789'),
(4, 'Nhà cung cấp 4', 'Địa chỉ 4', '0987654321'),
(5, 'Nhà cung cấp 5', 'Địa chỉ 5', '0123456789'),
(6, 'Nhà cung cấp 6', 'Địa chỉ 6', '0987654321'),
(7, 'Nhà cung cấp 7', 'Địa chỉ 7', '0123456789'),
(8, 'Nhà cung cấp 8', 'Địa chỉ 8', '0987654321'),
(9, 'Nhà cung cấp 9', 'Địa chỉ 9', '0123456789'),
(10, 'Nhà cung cấp 10', 'Địa chỉ 10', '0987654321');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `idNhanVien` int(11) NOT NULL,
  `MK` varchar(50) DEFAULT NULL,
  `CCCD` varchar(12) DEFAULT NULL,
  `hoTenLot` varchar(50) DEFAULT NULL,
  `ten` varchar(50) DEFAULT NULL,
  `ngaySinh` datetime DEFAULT NULL,
  `SDT` varchar(10) DEFAULT NULL,
  `trangThai` int(11) DEFAULT NULL,
  `chucVu` int(11) DEFAULT NULL,
  `luongThang` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`idNhanVien`, `MK`, `CCCD`, `hoTenLot`, `ten`, `ngaySinh`, `SDT`, `trangThai`, `chucVu`, `luongThang`) VALUES
(1, 'password1', '123456789012', 'Nguyễn', 'Văn A', '1990-01-01 00:00:00', '0123456789', 1, 1, 5000000),
(2, 'password2', '987654321012', 'Trần', 'Thị B', '1995-02-02 00:00:00', '0987654321', 1, 1, 6000000),
(3, 'password3', '456789012345', 'Lê', 'Thị C', '1992-03-03 00:00:00', '0123456789', 1, 1, 5500000),
(4, 'password4', '543210987654', 'Phạm', 'Văn D', '1988-04-04 00:00:00', '0987654321', 1, 1, 7000000),
(5, 'password5', '987654321012', 'Trần', 'Văn E', '1993-05-05 00:00:00', '0123456789', 1, 1, 6000000),
(6, 'password6', '123456789012', 'Nguyễn', 'Thị F', '1996-06-06 00:00:00', '0987654321', 1, 1, 5000000),
(7, 'password7', '210987654321', 'Võ', 'Thị G', '1991-07-07 00:00:00', '0123456789', 1, 3, 7000000),
(8, 'password8', '432109876543', 'Trương', 'Văn H', '1989-08-08 00:00:00', '0987654321', 1, 1, 6000000),
(9, 'password9', '765432109876', 'Nguyễn', 'Văn I', '1994-09-09 00:00:00', '0123456789', 1, 1, 5500000),
(10, 'password10', '210987654321', 'Lê', 'Thị K', '1997-10-10 00:00:00', '0987654321', 1, 1, 7000000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieunhap`
--

CREATE TABLE `phieunhap` (
  `idPhieuNhap` int(11) NOT NULL,
  `ngayLap` datetime DEFAULT NULL,
  `trangThai` int(11) DEFAULT NULL,
  `tongTien` int(11) DEFAULT NULL,
  `idNhaCungCap` int(11) DEFAULT NULL,
  `idNhanVien` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `phieunhap`
--

INSERT INTO `phieunhap` (`idPhieuNhap`, `ngayLap`, `trangThai`, `tongTien`, `idNhaCungCap`, `idNhanVien`) VALUES
(1, '2024-01-01 10:00:00', 1, 5000000, 1, 1),
(2, '2024-01-02 11:00:00', 1, 6000000, 2, 2),
(3, '2024-01-03 12:00:00', 1, 5500000, 3, 3),
(4, '2024-01-04 13:00:00', 1, 7000000, 4, 4),
(5, '2024-01-05 14:00:00', 1, 6000000, 5, 5),
(6, '2024-01-06 15:00:00', 1, 5000000, 6, 6),
(7, '2024-01-07 16:00:00', 1, 7000000, 7, 7),
(8, '2024-01-08 17:00:00', 1, 6000000, 8, 8),
(9, '2024-01-09 18:00:00', 1, 5500000, 9, 9),
(10, '2024-01-10 19:00:00', 1, 7000000, 10, 10);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sanpham`
--

CREATE TABLE `sanpham` (
  `idSP` int(11) NOT NULL,
  `tenSP` varchar(50) DEFAULT NULL,
  `soLuongSpConLai` int(11) DEFAULT NULL,
  `HSD` datetime DEFAULT NULL,
  `NSX` datetime DEFAULT NULL,
  `hinhAnhMinhHoa` varchar(50) DEFAULT NULL,
  `donGia` int(11) DEFAULT NULL,
  `idLoaiSP` int(11) DEFAULT NULL,
  `idChiTietSP` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `sanpham`
--

INSERT INTO `sanpham` (`idSP`, `tenSP`, `soLuongSpConLai`, `HSD`, `NSX`, `hinhAnhMinhHoa`, `donGia`, `idLoaiSP`, `idChiTietSP`) VALUES
(1, 'Choco Pie 1', 100, '2024-04-01 00:00:00', '2023-12-01 00:00:00', 'hinh1.jpg', 5000, 1, 1),
(2, 'Choco Pie 2', 80, '2024-05-10 00:00:00', '2023-11-15 00:00:00', 'hinh2.jpg', 7000, 1, 2),
(3, 'Choco Pie 3', 120, '2024-03-28 00:00:00', '2023-10-20 00:00:00', 'hinh3.jpg', 6000, 1, 3),
(4, 'Choco Pie 4', 90, '2024-06-05 00:00:00', '2023-09-05 00:00:00', 'hinh4.jpg', 5500, 1, 4),
(5, 'Choco Pie 5', 70, '2024-07-15 00:00:00', '2023-08-10 00:00:00', 'hinh5.jpg', 6500, 1, 5),
(6, 'Choco Pie 6', 110, '2024-04-30 00:00:00', '2023-07-01 00:00:00', 'hinh6.jpg', 7500, 1, 6),
(7, 'Choco Pie 7', 60, '2024-09-20 00:00:00', '2023-06-15 00:00:00', 'hinh7.jpg', 6000, 1, 7),
(8, 'Choco Pie 8', 100, '2024-08-10 00:00:00', '2023-05-20 00:00:00', 'hinh8.jpg', 8000, 1, 8),
(9, 'Choco Pie 9', 80, '2024-06-15 00:00:00', '2023-04-01 00:00:00', 'hinh9.jpg', 7000, 1, 9),
(10, 'Choco Pie 10', 70, '2024-05-01 00:00:00', '2023-03-15 00:00:00', 'hinh10.jpg', 9000, 1, 10);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `chitietchuongtrinhgiamgia`
--
ALTER TABLE `chitietchuongtrinhgiamgia`
  ADD PRIMARY KEY (`idChiTietChuongTrinhGiamGia`),
  ADD KEY `idChuongTrinh` (`idChuongTrinh`);

--
-- Chỉ mục cho bảng `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  ADD PRIMARY KEY (`idChiTietHoaDon`),
  ADD KEY `idHoaDon` (`idHoaDon`);

--
-- Chỉ mục cho bảng `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD PRIMARY KEY (`idChiTietPhieuNhap`),
  ADD KEY `idPhieuNhap` (`idPhieuNhap`),
  ADD KEY `idSP` (`idSP`);

--
-- Chỉ mục cho bảng `chitietsp`
--
ALTER TABLE `chitietsp`
  ADD PRIMARY KEY (`idChiTietSP`);

--
-- Chỉ mục cho bảng `chuongtrinhgiamgia`
--
ALTER TABLE `chuongtrinhgiamgia`
  ADD PRIMARY KEY (`idChuongTrinh`);

--
-- Chỉ mục cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`idHoaDon`),
  ADD KEY `idChiTietChuongTrinhGiamGia` (`idChiTietChuongTrinhGiamGia`),
  ADD KEY `idNhanVien` (`idNhanVien`),
  ADD KEY `idKhachHang` (`idKhachHang`);

--
-- Chỉ mục cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`idKhachHang`,`SDT`);

--
-- Chỉ mục cho bảng `loaisp`
--
ALTER TABLE `loaisp`
  ADD PRIMARY KEY (`idLoaiSP`);

--
-- Chỉ mục cho bảng `nhacungcap`
--
ALTER TABLE `nhacungcap`
  ADD PRIMARY KEY (`idNhaCungCap`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`idNhanVien`);

--
-- Chỉ mục cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD PRIMARY KEY (`idPhieuNhap`),
  ADD KEY `idNhanVien` (`idNhanVien`),
  ADD KEY `idNhaCungCap` (`idNhaCungCap`);

--
-- Chỉ mục cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`idSP`),
  ADD KEY `idLoaiSP` (`idLoaiSP`),
  ADD KEY `idChiTietSP` (`idChiTietSP`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `chitietchuongtrinhgiamgia`
--
ALTER TABLE `chitietchuongtrinhgiamgia`
  MODIFY `idChiTietChuongTrinhGiamGia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  MODIFY `idChiTietHoaDon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  MODIFY `idChiTietPhieuNhap` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `chitietsp`
--
ALTER TABLE `chitietsp`
  MODIFY `idChiTietSP` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `chuongtrinhgiamgia`
--
ALTER TABLE `chuongtrinhgiamgia`
  MODIFY `idChuongTrinh` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  MODIFY `idHoaDon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  MODIFY `idKhachHang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `loaisp`
--
ALTER TABLE `loaisp`
  MODIFY `idLoaiSP` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `nhacungcap`
--
ALTER TABLE `nhacungcap`
  MODIFY `idNhaCungCap` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `idNhanVien` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  MODIFY `idPhieuNhap` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  MODIFY `idSP` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `chitietchuongtrinhgiamgia`
--
ALTER TABLE `chitietchuongtrinhgiamgia`
  ADD CONSTRAINT `chitietchuongtrinhgiamgia_ibfk_1` FOREIGN KEY (`idChuongTrinh`) REFERENCES `chuongtrinhgiamgia` (`idChuongTrinh`);

--
-- Các ràng buộc cho bảng `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  ADD CONSTRAINT `chitiethoadon_ibfk_1` FOREIGN KEY (`idHoaDon`) REFERENCES `hoadon` (`idHoaDon`);

--
-- Các ràng buộc cho bảng `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD CONSTRAINT `chitietphieunhap_ibfk_1` FOREIGN KEY (`idPhieuNhap`) REFERENCES `phieunhap` (`idPhieuNhap`),
  ADD CONSTRAINT `chitietphieunhap_ibfk_2` FOREIGN KEY (`idSP`) REFERENCES `sanpham` (`idSP`);

--
-- Các ràng buộc cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `hoadon_ibfk_1` FOREIGN KEY (`idChiTietChuongTrinhGiamGia`) REFERENCES `chitietchuongtrinhgiamgia` (`idChiTietChuongTrinhGiamGia`),
  ADD CONSTRAINT `hoadon_ibfk_2` FOREIGN KEY (`idNhanVien`) REFERENCES `nhanvien` (`idNhanVien`),
  ADD CONSTRAINT `hoadon_ibfk_3` FOREIGN KEY (`idKhachHang`) REFERENCES `khachhang` (`idKhachHang`);

--
-- Các ràng buộc cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD CONSTRAINT `phieunhap_ibfk_1` FOREIGN KEY (`idNhanVien`) REFERENCES `nhanvien` (`idNhanVien`),
  ADD CONSTRAINT `phieunhap_ibfk_2` FOREIGN KEY (`idNhaCungCap`) REFERENCES `nhacungcap` (`idNhaCungCap`);

--
-- Các ràng buộc cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD CONSTRAINT `sanpham_ibfk_1` FOREIGN KEY (`idLoaiSP`) REFERENCES `loaisp` (`idLoaiSP`),
  ADD CONSTRAINT `sanpham_ibfk_2` FOREIGN KEY (`idChiTietSP`) REFERENCES `chitietsp` (`idChiTietSP`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
