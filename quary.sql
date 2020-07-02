muhammadazizi_06984
Enter password: azizi

TABLE_NAME
------------------------------
JENIS_BARANG
BARANG
TRANSAKSI

desc barang;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 KODE_BARANG                               NOT NULL NUMBER(38)
 ID_JENIS_BARANG                                    NUMBER(38)
 NAMA_BARANG                                        VARCHAR2(20)
 HARGA_BARANG                                       NUMBER(38)
 UKURAN_BARANG
desc transaksi
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 ID_TRANSAKSI                              NOT NULL NUMBER(38)
 KODE_BARANG                                        NUMBER(38)
 BAYAR_06984                                        NUMBER(38)
 KEMBALI                                            NUMBER(38)
 TOTAL                                              NUMBER(38)
 TANGGAL_TRANSAKSI                                  DATE
desc jenis_barang
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 ID_JENIS_BARANG                           NOT NULL NUMBER(38)
 KUALITAS_JENIS_BARANG                              VARCHAR2(10)

