class Hayvan:
    def __init__(self, ad, yas):
        self.ad = ad  # public attribute
        self._yas = yas  # protected attribute
        self.__tur = "Memeli"  # private attribute

    def ses_cikar(self):
        print(f"{self.ad} ses çıkarıyor!")

    def _bilgi_goster(self):
        print(f"Ad: {self.ad}, Yaş: {self._yas}")

    def __ozel_bilgi(self):
        print(f"Tür: {self.__tur}")

    def genel_bilgi(self):
        self._bilgi_goster()
        self.__ozel_bilgi()

class Kedi(Hayvan):
    def __init__(self, ad, yas, cins):
        super().__init__(ad, yas)
        self.cins = cins  # public attribute

    def ses_cikar(self):
        print(f"{self.ad} miyavlıyor!")

    def bilgi_goster(self):
        self._bilgi_goster()
        print(f"Cins: {self.cins}")

# Örnek kullanım
hayvan = Hayvan("Hayvan", 5)
hayvan.ses_cikar()
hayvan.genel_bilgi()

kedi = Kedi("Minnoş", 3, "Van Kedisi")
kedi.ses_cikar()
kedi.bilgi_goster()

# Aşağıdaki satır, özel metodun sınıf dışından erişilemeyeceğini gösterir:
# hayvan.__ozel_bilgi()  
# AttributeError: 'Hayvan' object has no attribute '__ozel_bilgi'
