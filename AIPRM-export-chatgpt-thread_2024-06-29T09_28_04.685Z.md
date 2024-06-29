
```
Exported with AIPRM https://www.aiprm.com by M Matthew Kaya on 6/29/2024, 5:28:04 AM
```

---


**User:**
Python la ilgili bir ders hazırlıyorum şimdi senden sıralı bir kod grubu yazmanı istiyorum 
kod bir sonrakiyle tutarlı ve genişleyerek ilerleyecek her aşamada kodu bir önceki kodu kullnarak yeniden yazmanı istiyorum 

1. print() komutu
2. pirint içinde değişken kullanmadan number ve stringi beraber kullan
3. print kullanarak matematiksel işlemler yapma
4. değişken kullanarak string ve karmaşık matematiksel işlemin birleşitirldiği örnekler yapar mısın
5 phytonda fonksiyon kullanımı
6 değişken scopeları
7 python da input kullanımı nı anlatıp örneler hazırlar mısın
8 şimdi de type castingle ilgili bir kaç örnek hazırlar mısın
9 Pyhtonda karşılaştırma ifadeleri nelerdir
10 bana pyhton da şart ifadelerinden bahsedip bunlarla iligli örnekler yapar mısın
11 pythonda type() kullanımı
12 bana input validation u anlatıp bir kaç örnek yapar mısın
13 pytonda error handling konusunu örneklerle anlatır mısın
14 pyhton da kullanabileceğim önceden tanımlanmış hata tipleri
15 Pyton da döngüler
16 pytohnda listleri 

Unutma 16 ya geldiğinde kodun son haline gelmesi gerekiyor. 16 aşama 15 in konundan 15 14ün kodundan 14 13 ün kodundan... üretilmesi lazım ve her bir aşamada öndelikle ilgili maddenin açıklamasını yap kodu yazdıktan sonra da kodun açıklamasını yap  

---

**ChatGPT:**
<p>Elbette, adım adım Python dersinizi hazırlayalım. Her aşamada bir önceki kodu genişleterek ilerleyeceğiz ve her aşama için açıklamalar sağlayacağım.</p><h3>1. print() komutu</h3><p><strong>Açıklama:</strong> <code>print()</code> komutu ekrana yazı yazdırmak için kullanılır. İçine yazılan her şeyi ekrana basar.</p><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba Dünya"</span>)
</code></div></div></pre><p><strong>Kod Açıklaması:</strong> Bu kod, ekrana "Merhaba Dünya" yazısını yazdırır.</p><h3>2. print() içinde değişken kullanmadan number ve stringi beraber kullan</h3><p><strong>Açıklama:</strong> <code>print()</code> komutu içinde hem sayılar hem de metinler kullanılabilir.</p><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-built_in">print</span>(<span class="hljs-string">"Yaşım"</span>, <span class="hljs-number">25</span>)
</code></div></div></pre><p><strong>Kod Açıklaması:</strong> Bu kod, ekrana "Yaşım 25" yazısını yazdırır. Burada string ve sayı aynı anda <code>print()</code> komutu ile kullanılmıştır.</p><h3>3. print kullanarak matematiksel işlemler yapma</h3><p><strong>Açıklama:</strong> <code>print()</code> komutu içinde matematiksel işlemler yapılabilir ve sonuç ekrana yazdırılabilir.</p><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-built_in">print</span>(<span class="hljs-string">"3 + 5 ="</span>, <span class="hljs-number">3</span> + <span class="hljs-number">5</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"10 - 2 ="</span>, <span class="hljs-number">10</span> - <span class="hljs-number">2</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"4 * 7 ="</span>, <span class="hljs-number">4</span> * <span class="hljs-number">7</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"20 / 4 ="</span>, <span class="hljs-number">20</span> / <span class="hljs-number">4</span>)
</code></div></div></pre><p><strong>Kod Açıklaması:</strong> Bu kodlar, çeşitli matematiksel işlemleri yapar ve sonuçlarını ekrana yazdırır. Örneğin, "3 + 5 = 8" gibi.</p><h3>4. Değişken kullanarak string ve karmaşık matematiksel işlemin birleştirildiği örnekler</h3><p><strong>Açıklama:</strong> Değişkenler kullanılarak daha karmaşık matematiksel işlemler yapılabilir ve sonuçlar stringlerle birleştirilip ekrana yazdırılabilir.</p><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python">x = <span class="hljs-number">10</span>
y = <span class="hljs-number">5</span>
z = <span class="hljs-number">2</span>
sonuc = x * y + z
<span class="hljs-built_in">print</span>(<span class="hljs-string">"İşlem: "</span>, x, <span class="hljs-string">"*"</span>, y, <span class="hljs-string">"+"</span>, z, <span class="hljs-string">"="</span>, sonuc)
</code></div></div></pre><p><strong>Kod Açıklaması:</strong> Bu kod, <code>x</code>, <code>y</code> ve <code>z</code> değişkenlerini kullanarak <code>(x * y + z)</code> işlemini yapar ve sonucu ekrana yazdırır.</p><h3>5. Python'da fonksiyon kullanımı</h3><p><strong>Açıklama:</strong> Fonksiyonlar, belirli bir görevi yerine getirmek için kullanılan kod bloklarıdır. <code>def</code> anahtar kelimesi ile tanımlanır.</p><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-keyword">def</span> <span class="hljs-title function_">merhaba_de</span>():
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba!"</span>)

merhaba_de()
</code></div></div></pre><p><strong>Kod Açıklaması:</strong> Bu kod, <code>merhaba_de</code> adlı bir fonksiyon tanımlar ve bu fonksiyon çağrıldığında ekrana "Merhaba!" yazdırır.</p><h3>6. Değişken scopeları</h3><p><strong>Açıklama:</strong> Değişkenler, farklı scopelarda (kapsamlarda) tanımlanabilir. Global ve local scope olmak üzere iki ana scope vardır.</p><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python">x = <span class="hljs-number">5</span>  <span class="hljs-comment"># Global scope</span>

<span class="hljs-keyword">def</span> <span class="hljs-title function_">fonksiyon</span>():
    x = <span class="hljs-number">10</span>  <span class="hljs-comment"># Local scope</span>
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Local x:"</span>, x)

fonksiyon()
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Global x:"</span>, x)
</code></div></div></pre><p><strong>Kod Açıklaması:</strong> Bu kod, global ve local scope örneği gösterir. Fonksiyon içindeki <code>x</code> değişkeni local'dir ve fonksiyon dışında tanımlanan <code>x</code> değişkeni global'dir.</p><h3>7. Python'da input kullanımı</h3><p><strong>Açıklama:</strong> <code>input()</code> fonksiyonu, kullanıcıdan veri almak için kullanılır.</p><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python">isim = <span class="hljs-built_in">input</span>(<span class="hljs-string">"Adınız nedir? "</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba"</span>, isim)
</code></div></div></pre><p><strong>Kod Açıklaması:</strong> Bu kod, kullanıcıdan adını alır ve "Merhaba" diyerek kullanıcıya selam verir.</p><h3>8. Type casting</h3><p><strong>Açıklama:</strong> Type casting, bir veri tipini diğerine dönüştürmek için kullanılır.</p><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python">sayi_str = <span class="hljs-string">"123"</span>
sayi = <span class="hljs-built_in">int</span>(sayi_str)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"String olarak:"</span>, sayi_str)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Integer olarak:"</span>, sayi)
</code></div></div></pre><p><strong>Kod Açıklaması:</strong> Bu kod, string tipindeki <code>sayi_str</code> değişkenini integer tipe dönüştürür ve sonucu ekrana yazdırır.</p><h3>9. Python'da karşılaştırma ifadeleri</h3><p><strong>Açıklama:</strong> Karşılaştırma ifadeleri, iki değeri karşılaştırmak için kullanılır. Örneğin <code>==</code>, <code>!=</code>, <code>&lt;</code>, <code>&gt;</code>, <code>&lt;=</code>, <code>&gt;=</code>.</p><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python">a = <span class="hljs-number">5</span>
b = <span class="hljs-number">10</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a == b:"</span>, a == b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a != b:"</span>, a != b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &lt; b:"</span>, a &lt; b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &gt; b:"</span>, a &gt; b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &lt;= b:"</span>, a &lt;= b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &gt;= b:"</span>, a &gt;= b)
</code></div></div></pre><p><strong>Kod Açıklaması:</strong> Bu kod, <code>a</code> ve <code>b</code> değişkenlerini çeşitli karşılaştırma operatörleri kullanarak karşılaştırır ve sonuçları ekrana yazdırır.</p><h3>10. Python'da şart ifadeleri</h3><p><strong>Açıklama:</strong> Şart ifadeleri, belirli bir koşulun doğru veya yanlış olmasına göre farklı işlemler yapar. <code>if</code>, <code>elif</code>, <code>else</code> kullanılır.</p><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python">yas = <span class="hljs-built_in">int</span>(<span class="hljs-built_in">input</span>(<span class="hljs-string">"Yaşınızı girin: "</span>))
<span class="hljs-keyword">if</span> yas &lt; <span class="hljs-number">18</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Reşit değilsiniz."</span>)
<span class="hljs-keyword">elif</span> yas &lt; <span class="hljs-number">65</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Çalışma yaşındasınız."</span>)
<span class="hljs-keyword">else</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Emekli yaşındasınız."</span>)
</code></div></div></pre><p><strong>Kod Açıklaması:</strong> Bu kod, kullanıcının yaşına göre farklı mesajlar ekrana yazdırır. <code>if</code>, <code>elif</code>, ve <code>else</code> ifadeleri kullanılmıştır.</p><h3>11. Python'da type() kullanımı</h3><p><strong>Açıklama:</strong> <code>type()</code> fonksiyonu, bir değişkenin tipini öğrenmek için kullanılır.</p><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python">a = <span class="hljs-number">10</span>
b = <span class="hljs-string">"Merhaba"</span>
c = <span class="hljs-number">3.14</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a'nın tipi:"</span>, <span class="hljs-built_in">type</span>(a))
<span class="hljs-built_in">print</span>(<span class="hljs-string">"b'nin tipi:"</span>, <span class="hljs-built_in">type</span>(b))
<span class="hljs-built_in">print</span>(<span class="hljs-string">"c'nin tipi:"</span>, <span class="hljs-built_in">type</span>(c))
</code></div></div></pre><p><strong>Kod Açıklaması:</strong> Bu kod, <code>a</code>, <code>b</code> ve <code>c</code> değişkenlerinin tiplerini <code>type()</code> fonksiyonuyla ekrana yazdırır.</p><h3>12. Input validation</h3><p><strong>Açıklama:</strong> Kullanıcıdan alınan verinin geçerli olup olmadığını kontrol etmek için input validation yapılır.</p><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-keyword">while</span> <span class="hljs-literal">True</span>:
    <span class="hljs-keyword">try</span>:
        yas = <span class="hljs-built_in">int</span>(<span class="hljs-built_in">input</span>(<span class="hljs-string">"Yaşınızı girin: "</span>))
        <span class="hljs-keyword">if</span> yas &gt;= <span class="hljs-number">0</span>:
            <span class="hljs-keyword">break</span>
        <span class="hljs-keyword">else</span>:
            <span class="hljs-built_in">print</span>(<span class="hljs-string">"Lütfen pozitif bir sayı girin."</span>)
    <span class="hljs-keyword">except</span> ValueError:
        <span class="hljs-built_in">print</span>(<span class="hljs-string">"Lütfen geçerli bir sayı girin."</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Yaşınız:"</span>, yas)
</code></div></div></pre><p><strong>Kod Açıklaması:</strong> Bu kod, kullanıcının geçerli bir yaş girmesini sağlar. Yanlış girişlerde hata mesajı verir ve kullanıcıdan tekrar girmesini ister.</p><h3>13. Python'da error handling</h3><p><strong>Açıklama:</strong> Hata yönetimi, <code>try</code>, <code>except</code>, <code>finally</code> blokları ile yapılır.</p><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-keyword">try</span>:
    sonuc = <span class="hljs-number">10</span> / <span class="hljs-number">0</span>
<span class="hljs-keyword">except</span> ZeroDivisionError:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Sıfıra bölme hatası!"</span>)
<span class="hljs-keyword">finally</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Bu mesaj her zaman yazdırılır."</span>)
</code></div></div></pre><p><strong>Kod Açıklaması:</strong> Bu kod, <code>ZeroDivisionError</code> hatasını yakalar ve ekrana hata mesajı yazdırır. <code>finally</code> bloğu her durumda çalışır.</p><h3>14. Python'da kullanabileceğim önceden tanımlanmış hata tipleri</h3><p><strong>Açıklama:</strong> Python'da çeşitli önceden tanımlanmış hata tipleri vardır. Örneğin <code>ValueError</code>, <code>TypeError</code>, <code>IndexError</code>.</p><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-keyword">try</span>:
    liste = [<span class="hljs-number">1</span>, <span class="hljs-number">2</span>, <span class="hljs-number">3</span>]
    <span class="hljs-built_in">print</span>(liste[<span class="hljs-number">5</span>])
<span class="hljs-keyword">except</span> IndexError:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Index hatası!"</span>)
<span class="hljs-keyword">except</span> ValueError:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Değer hatası!"</span>)
</code></div></div></pre><p><strong>Kod Açıklaması:</strong> Bu kod, <code>IndexError</code> hatasını yakalar ve ekrana hata mesajı yazdırır.</p><h3>15. Python'da döngüler</h3><p><strong>Açıklama:</strong> Python'da döngüler, belirli bir kod bloğunu birden fazla kez çalıştırmak için kullanılır. <code>for</code> ve <code>while</code> döngüleri vardır.</p><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-keyword">for</span> i <span class="hljs-keyword">in</span> <span class="hljs-built_in">range</span>(<span class="hljs-number">5</span>):
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"for döngüsü:"</span>, i)

j = <span class="hljs-number">0</span>
<span class="hljs-keyword">while</span> j &lt; <span class="hljs-number">5</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"while döngüsü:"</span>, j)
    j += <span class="hljs-number">1</span>
</code></div></div></pre><p><strong>Kod Açıklaması:</strong> Bu kod, <code>for</code> ve <code>while</code> döngülerinin nasıl kullanıldığını gösterir. <code>for</code> döngüsü 0'dan 4'e kadar, <code>while</code> döngüsü ise 0'dan 4'e kadar çalışır.</p><h3>16. Python'da listeler</h3><p><strong>Açıklama:</strong> Listeler, birden fazla değeri tek bir değişkende saklamak için kullanılır. Liste elemanlarına indeksleri ile erişilebilir.</p><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python">liste = [<span class="hljs-number">1</span>, <span class="hljs-number">2</span>, <span class="hljs-number">3</span>, <span class="hljs-number">4</span>, <span class="hljs-number">5</span>]

<span class="hljs-keyword">for</span> eleman <span class="hljs-keyword">in</span> liste:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Liste elemanı:"</span>, eleman)

<span class="hljs-built_in">print</span>(<span class="hljs-string">"Listenin ilk elemanı:"</span>, liste[<span class="hljs-number">0</span>])
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Listenin son elemanı:"</span>, liste[-<span class="hljs-number">1</span>])
</code></div></div></pre><p><strong>Kod Açıklaması:</strong> Bu kod, bir liste oluşturur ve liste elemanlarını ekrana yazdırır. Ayrıca listenin ilk ve son elemanlarına indeksleri ile erişir.</p><p>Bu adımlar ve açıklamalarla Python dersinizi oluşturabilirsiniz. Her aşama, bir önceki aşamanın üzerine inşa edilmiştir ve son aşamada tüm temel Python konuları kapsanmıştır.</p>

---

**User:**
yalnız bu şekilde istemedim aslında 16. maddenin sonunda yukarıdaki ifadelerin hepsinin bulunduğu bir kod istiyorum 15. maddede ilk 14 madde 14. maddede ilk 13 madde.. olacak şekilde olmalı ve her bir aşamada kod sıfırdan yazılmalı

---

**ChatGPT:**
<p>Anladım, her aşamada önceki aşamaların kodlarını da ekleyerek ilerleyeceğiz. Her aşamada, bir önceki aşamaların kodlarını da dahil ederek sıfırdan yazacağım. Başlayalım:</p><h3>1. print() komutu</h3><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-comment"># 1. print() komutu</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba Dünya"</span>)
</code></div></div></pre><h3>2. print() içinde değişken kullanmadan number ve stringi beraber kullan</h3><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-comment"># 1. print() komutu</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba Dünya"</span>)

<span class="hljs-comment"># 2. print() içinde değişken kullanmadan number ve stringi beraber kullan</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Yaşım"</span>, <span class="hljs-number">25</span>)
</code></div></div></pre><h3>3. print kullanarak matematiksel işlemler yapma</h3><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-comment"># 1. print() komutu</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba Dünya"</span>)

<span class="hljs-comment"># 2. print() içinde değişken kullanmadan number ve stringi beraber kullan</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Yaşım"</span>, <span class="hljs-number">25</span>)

<span class="hljs-comment"># 3. print kullanarak matematiksel işlemler yapma</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"3 + 5 ="</span>, <span class="hljs-number">3</span> + <span class="hljs-number">5</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"10 - 2 ="</span>, <span class="hljs-number">10</span> - <span class="hljs-number">2</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"4 * 7 ="</span>, <span class="hljs-number">4</span> * <span class="hljs-number">7</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"20 / 4 ="</span>, <span class="hljs-number">20</span> / <span class="hljs-number">4</span>)
</code></div></div></pre><h3>4. Değişken kullanarak string ve karmaşık matematiksel işlemin birleştirildiği örnekler</h3><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-comment"># 1. print() komutu</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba Dünya"</span>)

<span class="hljs-comment"># 2. print() içinde değişken kullanmadan number ve stringi beraber kullan</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Yaşım"</span>, <span class="hljs-number">25</span>)

<span class="hljs-comment"># 3. print kullanarak matematiksel işlemler yapma</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"3 + 5 ="</span>, <span class="hljs-number">3</span> + <span class="hljs-number">5</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"10 - 2 ="</span>, <span class="hljs-number">10</span> - <span class="hljs-number">2</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"4 * 7 ="</span>, <span class="hljs-number">4</span> * <span class="hljs-number">7</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"20 / 4 ="</span>, <span class="hljs-number">20</span> / <span class="hljs-number">4</span>)

<span class="hljs-comment"># 4. Değişken kullanarak string ve karmaşık matematiksel işlemin birleştirildiği örnekler</span>
x = <span class="hljs-number">10</span>
y = <span class="hljs-number">5</span>
z = <span class="hljs-number">2</span>
sonuc = x * y + z
<span class="hljs-built_in">print</span>(<span class="hljs-string">"İşlem: "</span>, x, <span class="hljs-string">"*"</span>, y, <span class="hljs-string">"+"</span>, z, <span class="hljs-string">"="</span>, sonuc)
</code></div></div></pre><h3>5. Python'da fonksiyon kullanımı</h3><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-comment"># 1. print() komutu</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba Dünya"</span>)

<span class="hljs-comment"># 2. print() içinde değişken kullanmadan number ve stringi beraber kullan</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Yaşım"</span>, <span class="hljs-number">25</span>)

<span class="hljs-comment"># 3. print kullanarak matematiksel işlemler yapma</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"3 + 5 ="</span>, <span class="hljs-number">3</span> + <span class="hljs-number">5</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"10 - 2 ="</span>, <span class="hljs-number">10</span> - <span class="hljs-number">2</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"4 * 7 ="</span>, <span class="hljs-number">4</span> * <span class="hljs-number">7</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"20 / 4 ="</span>, <span class="hljs-number">20</span> / <span class="hljs-number">4</span>)

<span class="hljs-comment"># 4. Değişken kullanarak string ve karmaşık matematiksel işlemin birleştirildiği örnekler</span>
x = <span class="hljs-number">10</span>
y = <span class="hljs-number">5</span>
z = <span class="hljs-number">2</span>
sonuc = x * y + z
<span class="hljs-built_in">print</span>(<span class="hljs-string">"İşlem: "</span>, x, <span class="hljs-string">"*"</span>, y, <span class="hljs-string">"+"</span>, z, <span class="hljs-string">"="</span>, sonuc)

<span class="hljs-comment"># 5. Python'da fonksiyon kullanımı</span>
<span class="hljs-keyword">def</span> <span class="hljs-title function_">merhaba_de</span>():
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba!"</span>)

merhaba_de()
</code></div></div></pre><h3>6. Değişken scopeları</h3><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-comment"># 1. print() komutu</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba Dünya"</span>)

<span class="hljs-comment"># 2. print() içinde değişken kullanmadan number ve stringi beraber kullan</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Yaşım"</span>, <span class="hljs-number">25</span>)

<span class="hljs-comment"># 3. print kullanarak matematiksel işlemler yapma</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"3 + 5 ="</span>, <span class="hljs-number">3</span> + <span class="hljs-number">5</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"10 - 2 ="</span>, <span class="hljs-number">10</span> - <span class="hljs-number">2</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"4 * 7 ="</span>, <span class="hljs-number">4</span> * <span class="hljs-number">7</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"20 / 4 ="</span>, <span class="hljs-number">20</span> / <span class="hljs-number">4</span>)

<span class="hljs-comment"># 4. Değişken kullanarak string ve karmaşık matematiksel işlemin birleştirildiği örnekler</span>
x = <span class="hljs-number">10</span>
y = <span class="hljs-number">5</span>
z = <span class="hljs-number">2</span>
sonuc = x * y + z
<span class="hljs-built_in">print</span>(<span class="hljs-string">"İşlem: "</span>, x, <span class="hljs-string">"*"</span>, y, <span class="hljs-string">"+"</span>, z, <span class="hljs-string">"="</span>, sonuc)

<span class="hljs-comment"># 5. Python'da fonksiyon kullanımı</span>
<span class="hljs-keyword">def</span> <span class="hljs-title function_">merhaba_de</span>():
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba!"</span>)

merhaba_de()

<span class="hljs-comment"># 6. Değişken scopeları</span>
x = <span class="hljs-number">5</span>  <span class="hljs-comment"># Global scope</span>

<span class="hljs-keyword">def</span> <span class="hljs-title function_">fonksiyon</span>():
    x = <span class="hljs-number">10</span>  <span class="hljs-comment"># Local scope</span>
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Local x:"</span>, x)

fonksiyon()
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Global x:"</span>, x)
</code></div></div></pre><h3>7. Python'da input kullanımı</h3><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-comment"># 1. print() komutu</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba Dünya"</span>)

<span class="hljs-comment"># 2. print() içinde değişken kullanmadan number ve stringi beraber kullan</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Yaşım"</span>, <span class="hljs-number">25</span>)

<span class="hljs-comment"># 3. print kullanarak matematiksel işlemler yapma</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"3 + 5 ="</span>, <span class="hljs-number">3</span> + <span class="hljs-number">5</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"10 - 2 ="</span>, <span class="hljs-number">10</span> - <span class="hljs-number">2</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"4 * 7 ="</span>, <span class="hljs-number">4</span> * <span class="hljs-number">7</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"20 / 4 ="</span>, <span class="hljs-number">20</span> / <span class="hljs-number">4</span>)

<span class="hljs-comment"># 4. Değişken kullanarak string ve karmaşık matematiksel işlemin birleştirildiği örnekler</span>
x = <span class="hljs-number">10</span>
y = <span class="hljs-number">5</span>
z = <span class="hljs-number">2</span>
sonuc = x * y + z
<span class="hljs-built_in">print</span>(<span class="hljs-string">"İşlem: "</span>, x, <span class="hljs-string">"*"</span>, y, <span class="hljs-string">"+"</span>, z, <span class="hljs-string">"="</span>, sonuc)

<span class="hljs-comment"># 5. Python'da fonksiyon kullanımı</span>
<span class="hljs-keyword">def</span> <span class="hljs-title function_">merhaba_de</span>():
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba!"</span>)

merhaba_de()

<span class="hljs-comment"># 6. Değişken scopeları</span>
x = <span class="hljs-number">5</span>  <span class="hljs-comment"># Global scope</span>

<span class="hljs-keyword">def</span> <span class="hljs-title function_">fonksiyon</span>():
    x = <span class="hljs-number">10</span>  <span class="hljs-comment"># Local scope</span>
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Local x:"</span>, x)

fonksiyon()
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Global x:"</span>, x)

<span class="hljs-comment"># 7. Python'da input kullanımı</span>
isim = <span class="hljs-built_in">input</span>(<span class="hljs-string">"Adınız nedir? "</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba"</span>, isim)
</code></div></div></pre><h3>8. Type casting</h3><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-comment"># 1. print() komutu</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba Dünya"</span>)

<span class="hljs-comment"># 2. print() içinde değişken kullanmadan number ve stringi beraber kullan</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Yaşım"</span>, <span class="hljs-number">25</span>)

<span class="hljs-comment"># 3. print kullanarak matematiksel işlemler yapma</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"3 + 5 ="</span>, <span class="hljs-number">3</span> + <span class="hljs-number">5</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"10 - 2 ="</span>, <span class="hljs-number">10</span> - <span class="hljs-number">2</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"4 * 7 ="</span>, <span class="hljs-number">4</span> * <span class="hljs-number">7</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"20 / 4 ="</span>, <span class="hljs-number">20</span> / <span class="hljs-number">4</span>)

<span class="hljs-comment"># 4. Değişken kullanarak string ve karmaşık matematiksel işlemin birleştirildiği örnekler</span>
x = <span class="hljs-number">10</span>
y = <span class="hljs-number">5</span>
z = <span class="hljs-number">2</span>
sonuc = x * y + z
<span class="hljs-built_in">print</span>(<span class="hljs-string">"İşlem: "</span>, x, <span class="hljs-string">"*"</span>, y, <span class="hljs-string">"+"</span>, z, <span class="hljs-string">"="</span>, sonuc)

<span class="hljs-comment"># 5. Python'da fonksiyon kullanımı</span>
<span class="hljs-keyword">def</span> <span class="hljs-title function_">merhaba_de</span>():
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba!"</span>)

merhaba_de()

<span class="hljs-comment"># 6. Değişken scopeları</span>
x = <span class="hljs-number">5</span>  <span class="hljs-comment"># Global scope</span>

<span class="hljs-keyword">def</span> <span class="hljs-title function_">fonksiyon</span>():
    x = <span class="hljs-number">10</span>  <span class="hljs-comment"># Local scope</span>
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Local x:"</span>, x)

fonksiyon()
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Global x:"</span>, x)

<span class="hljs-comment"># 7. Python'da input kullanımı</span>
isim = <span class="hljs-built_in">input</span>(<span class="hljs-string">"Adınız nedir? "</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba"</span>, isim)

<span class="hljs-comment"># 8. Type casting</span>
sayi_str = <span class="hljs-string">"123"</span>
sayi = <span class="hljs-built_in">int</span>(sayi_str)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"String olarak:"</span>, sayi_str)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Integer olarak:"</span>, sayi)
</code></div></div></pre><h3>9. Python'da karşılaştırma ifadeleri</h3><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-comment"># 1. print() komutu</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba Dünya"</span>)

<span class="hljs-comment"># 2. print() içinde değişken kullanmadan number ve stringi beraber kullan</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Yaşım"</span>, <span class="hljs-number">25</span>)

<span class="hljs-comment"># 3. print kullanarak matematiksel işlemler yapma</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"3 + 5 ="</span>, <span class="hljs-number">3</span> + <span class="hljs-number">5</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"10 - 2 ="</span>, <span class="hljs-number">10</span> - <span class="hljs-number">2</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"4 * 7 ="</span>, <span class="hljs-number">4</span> * <span class="hljs-number">7</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"20 / 4 ="</span>, <span class="hljs-number">20</span> / <span class="hljs-number">4</span>)

<span class="hljs-comment"># 4. Değişken kullanarak string ve karmaşık matematiksel işlemin birleştirildiği örnekler</span>
x = <span class="hljs-number">10</span>
y = <span class="hljs-number">5</span>
z = <span class="hljs-number">2</span>
sonuc = x * y + z
<span class="hljs-built_in">print</span>(<span class="hljs-string">"İşlem: "</span>, x, <span class="hljs-string">"*"</span>, y, <span class="hljs-string">"+"</span>, z, <span class="hljs-string">"="</span>, sonuc)

<span class="hljs-comment"># 5. Python'da fonksiyon kullanımı</span>
<span class="hljs-keyword">def</span> <span class="hljs-title function_">merhaba_de</span>():
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba!"</span>)

merhaba_de()

<span class="hljs-comment"># 6. Değişken scopeları</span>
x = <span class="hljs-number">5</span>  <span class="hljs-comment"># Global scope</span>

<span class="hljs-keyword">def</span> <span class="hljs-title function_">fonksiyon</span>():
    x = <span class="hljs-number">10</span>  <span class="hljs-comment"># Local scope</span>
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Local x:"</span>, x)

fonksiyon()
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Global x:"</span>, x)

<span class="hljs-comment"># 7. Python'da input kullanımı</span>
isim = <span class="hljs-built_in">input</span>(<span class="hljs-string">"Adınız nedir? "</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba"</span>, isim)

<span class="hljs-comment"># 8. Type casting</span>
sayi_str = <span class="hljs-string">"123"</span>
sayi = <span class="hljs-built_in">int</span>(sayi_str)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"String olarak:"</span>, sayi_str)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Integer olarak:"</span>, sayi)

<span class="hljs-comment"># 9. Python'da karşılaştırma ifadeleri</span>
a = <span class="hljs-number">5</span>
b = <span class="hljs-number">10</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a == b:"</span>, a == b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a != b:"</span>, a != b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &lt; b:"</span>, a &lt; b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &gt; b:"</span>, a &gt; b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &lt;= b:"</span>, a &lt;= b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &gt;= b:"</span>, a &gt;= b)
</code></div></div></pre><h3>10. Python'da şart ifadeleri</h3><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-comment"># 1. print() komutu</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba Dünya"</span>)

<span class="hljs-comment"># 2. print() içinde değişken kullanmadan number ve stringi beraber kullan</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Yaşım"</span>, <span class="hljs-number">25</span>)

<span class="hljs-comment"># 3. print kullanarak matematiksel işlemler yapma</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"3 + 5 ="</span>, <span class="hljs-number">3</span> + <span class="hljs-number">5</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"10 - 2 ="</span>, <span class="hljs-number">10</span> - <span class="hljs-number">2</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"4 * 7 ="</span>, <span class="hljs-number">4</span> * <span class="hljs-number">7</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"20 / 4 ="</span>, <span class="hljs-number">20</span> / <span class="hljs-number">4</span>)

<span class="hljs-comment"># 4. Değişken kullanarak string ve karmaşık matematiksel işlemin birleştirildiği örnekler</span>
x = <span class="hljs-number">10</span>
y = <span class="hljs-number">5</span>
z = <span class="hljs-number">2</span>
sonuc = x * y + z
<span class="hljs-built_in">print</span>(<span class="hljs-string">"İşlem: "</span>, x, <span class="hljs-string">"*"</span>, y, <span class="hljs-string">"+"</span>, z, <span class="hljs-string">"="</span>, sonuc)

<span class="hljs-comment"># 5. Python'da fonksiyon kullanımı</span>
<span class="hljs-keyword">def</span> <span class="hljs-title function_">merhaba_de</span>():
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba!"</span>)

merhaba_de()

<span class="hljs-comment"># 6. Değişken scopeları</span>
x = <span class="hljs-number">5</span>  <span class="hljs-comment"># Global scope</span>

<span class="hljs-keyword">def</span> <span class="hljs-title function_">fonksiyon</span>():
    x = <span class="hljs-number">10</span>  <span class="hljs-comment"># Local scope</span>
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Local x:"</span>, x)

fonksiyon()
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Global x:"</span>, x)

<span class="hljs-comment"># 7. Python'da input kullanımı</span>
isim = <span class="hljs-built_in">input</span>(<span class="hljs-string">"Adınız nedir? "</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba"</span>, isim)

<span class="hljs-comment"># 8. Type casting</span>
sayi_str = <span class="hljs-string">"123"</span>
sayi = <span class="hljs-built_in">int</span>(sayi_str)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"String olarak:"</span>, sayi_str)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Integer olarak:"</span>, sayi)

<span class="hljs-comment"># 9. Python'da karşılaştırma ifadeleri</span>
a = <span class="hljs-number">5</span>
b = <span class="hljs-number">10</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a == b:"</span>, a == b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a != b:"</span>, a != b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &lt; b:"</span>, a &lt; b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &gt; b:"</span>, a &gt; b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &lt;= b:"</span>, a &lt;= b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &gt;= b:"</span>, a &gt;= b)

<span class="hljs-comment"># 10. Python'da şart ifadeleri</span>
yas = <span class="hljs-built_in">int</span>(<span class="hljs-built_in">input</span>(<span class="hljs-string">"Yaşınızı girin: "</span>))
<span class="hljs-keyword">if</span> yas &lt; <span class="hljs-number">18</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Reşit değilsiniz."</span>)
<span class="hljs-keyword">elif</span> yas &lt; <span class="hljs-number">65</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Çalışma yaşındasınız."</span>)
<span class="hljs-keyword">else</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Emekli yaşındasınız."</span>)
</code></div></div></pre><h3>11. Python'da type() kullanımı</h3><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-comment"># 1. print() komutu</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba Dünya"</span>)

<span class="hljs-comment"># 2. print() içinde değişken kullanmadan number ve stringi beraber kullan</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Yaşım"</span>, <span class="hljs-number">25</span>)

<span class="hljs-comment"># 3. print kullanarak matematiksel işlemler yapma</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"3 + 5 ="</span>, <span class="hljs-number">3</span> + <span class="hljs-number">5</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"10 - 2 ="</span>, <span class="hljs-number">10</span> - <span class="hljs-number">2</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"4 * 7 ="</span>, <span class="hljs-number">4</span> * <span class="hljs-number">7</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"20 / 4 ="</span>, <span class="hljs-number">20</span> / <span class="hljs-number">4</span>)

<span class="hljs-comment"># 4. Değişken kullanarak string ve karmaşık matematiksel işlemin birleştirildiği örnekler</span>
x = <span class="hljs-number">10</span>
y = <span class="hljs-number">5</span>
z = <span class="hljs-number">2</span>
sonuc = x * y + z
<span class="hljs-built_in">print</span>(<span class="hljs-string">"İşlem: "</span>, x, <span class="hljs-string">"*"</span>, y, <span class="hljs-string">"+"</span>, z, <span class="hljs-string">"="</span>, sonuc)

<span class="hljs-comment"># 5. Python'da fonksiyon kullanımı</span>
<span class="hljs-keyword">def</span> <span class="hljs-title function_">merhaba_de</span>():
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba!"</span>)

merhaba_de()

<span class="hljs-comment"># 6. Değişken scopeları</span>
x = <span class="hljs-number">5</span>  <span class="hljs-comment"># Global scope</span>

<span class="hljs-keyword">def</span> <span class="hljs-title function_">fonksiyon</span>():
    x = <span class="hljs-number">10</span>  <span class="hljs-comment"># Local scope</span>
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Local x:"</span>, x)

fonksiyon()
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Global x:"</span>, x)

<span class="hljs-comment"># 7. Python'da input kullanımı</span>
isim = <span class="hljs-built_in">input</span>(<span class="hljs-string">"Adınız nedir? "</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba"</span>, isim)

<span class="hljs-comment"># 8. Type casting</span>
sayi_str = <span class="hljs-string">"123"</span>
sayi = <span class="hljs-built_in">int</span>(sayi_str)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"String olarak:"</span>, sayi_str)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Integer olarak:"</span>, sayi)

<span class="hljs-comment"># 9. Python'da karşılaştırma ifadeleri</span>
a = <span class="hljs-number">5</span>
b = <span class="hljs-number">10</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a == b:"</span>, a == b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a != b:"</span>, a != b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &lt; b:"</span>, a &lt; b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &gt; b:"</span>, a &gt; b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &lt;= b:"</span>, a &lt;= b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &gt;= b:"</span>, a &gt;= b)

<span class="hljs-comment"># 10. Python'da şart ifadeleri</span>
yas = <span class="hljs-built_in">int</span>(<span class="hljs-built_in">input</span>(<span class="hljs-string">"Yaşınızı girin: "</span>))
<span class="hljs-keyword">if</span> yas &lt; <span class="hljs-number">18</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Reşit değilsiniz."</span>)
<span class="hljs-keyword">elif</span> yas &lt; <span class="hljs-number">65</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Çalışma yaşındasınız."</span>)
<span class="hljs-keyword">else</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Emekli yaşındasınız."</span>)

<span class="hljs-comment"># 11. Python'da type() kullanımı</span>
a = <span class="hljs-number">10</span>
b = <span class="hljs-string">"Merhaba"</span>
c = <span class="hljs-number">3.14</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a'nın tipi:"</span>, <span class="hljs-built_in">type</span>(a))
<span class="hljs-built_in">print</span>(<span class="hljs-string">"b'nin tipi:"</span>, <span class="hljs-built_in">type</span>(b))
<span class="hljs-built_in">print</span>(<span class="hljs-string">"c'nin tipi:"</span>, <span class="hljs-built_in">type</span>(c))
</code></div></div></pre><h3>12. Input validation</h3><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-comment"># 1. print() komutu</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba Dünya"</span>)

<span class="hljs-comment"># 2. print() içinde değişken kullanmadan number ve stringi beraber kullan</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Yaşım"</span>, <span class="hljs-number">25</span>)

<span class="hljs-comment"># 3. print kullanarak matematiksel işlemler yapma</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"3 + 5 ="</span>, <span class="hljs-number">3</span> + <span class="hljs-number">5</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"10 - 2 ="</span>, <span class="hljs-number">10</span> - <span class="hljs-number">2</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"4 * 7 ="</span>, <span class="hljs-number">4</span> * <span class="hljs-number">7</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"20 / 4 ="</span>, <span class="hljs-number">20</span> / <span class="hljs-number">4</span>)

<span class="hljs-comment"># 4. Değişken kullanarak string ve karmaşık matematiksel işlemin birleştirildiği örnekler</span>
x = <span class="hljs-number">10</span>
y = <span class="hljs-number">5</span>
z = <span class="hljs-number">2</span>
sonuc = x * y + z
<span class="hljs-built_in">print</span>(<span class="hljs-string">"İşlem: "</span>, x, <span class="hljs-string">"*"</span>, y, <span class="hljs-string">"+"</span>, z, <span class="hljs-string">"="</span>, sonuc)

<span class="hljs-comment"># 5. Python'da fonksiyon kullanımı</span>
<span class="hljs-keyword">def</span> <span class="hljs-title function_">merhaba_de</span>():
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba!"</span>)

merhaba_de()

<span class="hljs-comment"># 6. Değişken scopeları</span>
x = <span class="hljs-number">5</span>  <span class="hljs-comment"># Global scope</span>

<span class="hljs-keyword">def</span> <span class="hljs-title function_">fonksiyon</span>():
    x = <span class="hljs-number">10</span>  <span class="hljs-comment"># Local scope</span>
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Local x:"</span>, x)

fonksiyon()
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Global x:"</span>, x)

<span class="hljs-comment"># 7. Python'da input kullanımı</span>
isim = <span class="hljs-built_in">input</span>(<span class="hljs-string">"Adınız nedir? "</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba"</span>, isim)

<span class="hljs-comment"># 8. Type casting</span>
sayi_str = <span class="hljs-string">"123"</span>
sayi = <span class="hljs-built_in">int</span>(sayi_str)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"String olarak:"</span>, sayi_str)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Integer olarak:"</span>, sayi)

<span class="hljs-comment"># 9. Python'da karşılaştırma ifadeleri</span>
a = <span class="hljs-number">5</span>
b = <span class="hljs-number">10</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a == b:"</span>, a == b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a != b:"</span>, a != b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &lt; b:"</span>, a &lt; b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &gt; b:"</span>, a &gt; b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &lt;= b:"</span>, a &lt;= b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &gt;= b:"</span>, a &gt;= b)

<span class="hljs-comment"># 10. Python'da şart ifadeleri</span>
yas = <span class="hljs-built_in">int</span>(<span class="hljs-built_in">input</span>(<span class="hljs-string">"Yaşınızı girin: "</span>))
<span class="hljs-keyword">if</span> yas &lt; <span class="hljs-number">18</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Reşit değilsiniz."</span>)
<span class="hljs-keyword">elif</span> yas &lt; <span class="hljs-number">65</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Çalışma yaşındasınız."</span>)
<span class="hljs-keyword">else</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Emekli yaşındasınız."</span>)

<span class="hljs-comment"># 11. Python'da type() kullanımı</span>
a = <span class="hljs-number">10</span>
b = <span class="hljs-string">"Merhaba"</span>
c = <span class="hljs-number">3.14</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a'nın tipi:"</span>, <span class="hljs-built_in">type</span>(a))
<span class="hljs-built_in">print</span>(<span class="hljs-string">"b'nin tipi:"</span>, <span class="hljs-built_in">type</span>(b))
<span class="hljs-built_in">print</span>(<span class="hljs-string">"c'nin tipi:"</span>, <span class="hljs-built_in">type</span>(c))

<span class="hljs-comment"># 12. Input validation</span>
<span class="hljs-keyword">while</span> <span class="hljs-literal">True</span>:
    <span class="hljs-keyword">try</span>:
        yas = <span class="hljs-built_in">int</span>(<span class="hljs-built_in">input</span>(<span class="hljs-string">"Yaşınızı girin: "</span>))
        <span class="hljs-keyword">if</span> yas &gt;= <span class="hljs-number">0</span>:
            <span class="hljs-keyword">break</span>
        <span class="hljs-keyword">else</span>:
            <span class="hljs-built_in">print</span>(<span class="hljs-string">"Lütfen pozitif bir sayı girin."</span>)
    <span class="hljs-keyword">except</span> ValueError:
        <span class="hljs-built_in">print</span>(<span class="hljs-string">"Lütfen geçerli bir sayı girin."</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Yaşınız:"</span>, yas)
</code></div></div></pre><h3>13. Python'da error handling</h3><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-comment"># 1. print() komutu</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba Dünya"</span>)

<span class="hljs-comment"># 2. print() içinde değişken kullanmadan number ve stringi beraber kullan</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Yaşım"</span>, <span class="hljs-number">25</span>)

<span class="hljs-comment"># 3. print kullanarak matematiksel işlemler yapma</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"3 + 5 ="</span>, <span class="hljs-number">3</span> + <span class="hljs-number">5</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"10 - 2 ="</span>, <span class="hljs-number">10</span> - <span class="hljs-number">2</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"4 * 7 ="</span>, <span class="hljs-number">4</span> * <span class="hljs-number">7</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"20 / 4 ="</span>, <span class="hljs-number">20</span> / <span class="hljs-number">4</span>)

<span class="hljs-comment"># 4. Değişken kullanarak string ve karmaşık matematiksel işlemin birleştirildiği örnekler</span>
x = <span class="hljs-number">10</span>
y = <span class="hljs-number">5</span>
z = <span class="hljs-number">2</span>
sonuc = x * y + z
<span class="hljs-built_in">print</span>(<span class="hljs-string">"İşlem: "</span>, x, <span class="hljs-string">"*"</span>, y, <span class="hljs-string">"+"</span>, z, <span class="hljs-string">"="</span>, sonuc)

<span class="hljs-comment"># 5. Python'da fonksiyon kullanımı</span>
<span class="hljs-keyword">def</span> <span class="hljs-title function_">merhaba_de</span>():
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba!"</span>)

merhaba_de()

<span class="hljs-comment"># 6. Değişken scopeları</span>
x = <span class="hljs-number">5</span>  <span class="hljs-comment"># Global scope</span>

<span class="hljs-keyword">def</span> <span class="hljs-title function_">fonksiyon</span>():
    x = <span class="hljs-number">10</span>  <span class="hljs-comment"># Local scope</span>
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Local x:"</span>, x)

fonksiyon()
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Global x:"</span>, x)

<span class="hljs-comment"># 7. Python'da input kullanımı</span>
isim = <span class="hljs-built_in">input</span>(<span class="hljs-string">"Adınız nedir? "</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba"</span>, isim)

<span class="hljs-comment"># 8. Type casting</span>
sayi_str = <span class="hljs-string">"123"</span>
sayi = <span class="hljs-built_in">int</span>(sayi_str)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"String olarak:"</span>, sayi_str)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Integer olarak:"</span>, sayi)

<span class="hljs-comment"># 9. Python'da karşılaştırma ifadeleri</span>
a = <span class="hljs-number">5</span>
b = <span class="hljs-number">10</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a == b:"</span>, a == b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a != b:"</span>, a != b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &lt; b:"</span>, a &lt; b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &gt; b:"</span>, a &gt; b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &lt;= b:"</span>, a &lt;= b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &gt;= b:"</span>, a &gt;= b)

<span class="hljs-comment"># 10. Python'da şart ifadeleri</span>
yas = <span class="hljs-built_in">int</span>(<span class="hljs-built_in">input</span>(<span class="hljs-string">"Yaşınızı girin: "</span>))
<span class="hljs-keyword">if</span> yas &lt; <span class="hljs-number">18</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Reşit değilsiniz."</span>)
<span class="hljs-keyword">elif</span> yas &lt; <span class="hljs-number">65</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Çalışma yaşındasınız."</span>)
<span class="hljs-keyword">else</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Emekli yaşındasınız."</span>)

<span class="hljs-comment"># 11. Python'da type() kullanımı</span>
a = <span class="hljs-number">10</span>
b = <span class="hljs-string">"Merhaba"</span>
c = <span class="hljs-number">3.14</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a'nın tipi:"</span>, <span class="hljs-built_in">type</span>(a))
<span class="hljs-built_in">print</span>(<span class="hljs-string">"b'nin tipi:"</span>, <span class="hljs-built_in">type</span>(b))
<span class="hljs-built_in">print</span>(<span class="hljs-string">"c'nin tipi:"</span>, <span class="hljs-built_in">type</span>(c))

<span class="hljs-comment"># 12. Input validation</span>
<span class="hljs-keyword">while</span> <span class="hljs-literal">True</span>:
    <span class="hljs-keyword">try</span>:
        yas = <span class="hljs-built_in">int</span>(<span class="hljs-built_in">input</span>(<span class="hljs-string">"Yaşınızı girin: "</span>))
        <span class="hljs-keyword">if</span> yas &gt;= <span class="hljs-number">0</span>:
            <span class="hljs-keyword">break</span>
        <span class="hljs-keyword">else</span>:
            <span class="hljs-built_in">print</span>(<span class="hljs-string">"Lütfen pozitif bir sayı girin."</span>)
    <span class="hljs-keyword">except</span> ValueError:
        <span class="hljs-built_in">print</span>(<span class="hljs-string">"Lütfen geçerli bir sayı girin."</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Yaşınız:"</span>, yas)

<span class="hljs-comment"># 13. Python'da error handling</span>
<span class="hljs-keyword">try</span>:
    sonuc = <span class="hljs-number">10</span> / <span class="hljs-number">0</span>
<span class="hljs-keyword">except</span> ZeroDivisionError:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Sıfıra bölme hatası!"</span>)
<span class="hljs-keyword">finally</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Bu mesaj her zaman yazdırılır."</span>)
</code></div></div></pre><h3>14. Python'da kullanabileceğim önceden tanımlanmış hata tipleri</h3><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-comment"># 1. print() komutu</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba Dünya"</span>)

<span class="hljs-comment"># 2. print() içinde değişken kullanmadan number ve stringi beraber kullan</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Yaşım"</span>, <span class="hljs-number">25</span>)

<span class="hljs-comment"># 3. print kullanarak matematiksel işlemler yapma</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"3 + 5 ="</span>, <span class="hljs-number">3</span> + <span class="hljs-number">5</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"10 - 2 ="</span>, <span class="hljs-number">10</span> - <span class="hljs-number">2</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"4 * 7 ="</span>, <span class="hljs-number">4</span> * <span class="hljs-number">7</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"20 / 4 ="</span>, <span class="hljs-number">20</span> / <span class="hljs-number">4</span>)

<span class="hljs-comment"># 4. Değişken kullanarak string ve karmaşık matematiksel işlemin birleştirildiği örnekler</span>
x = <span class="hljs-number">10</span>
y = <span class="hljs-number">5</span>
z = <span class="hljs-number">2</span>
sonuc = x * y + z
<span class="hljs-built_in">print</span>(<span class="hljs-string">"İşlem: "</span>, x, <span class="hljs-string">"*"</span>, y, <span class="hljs-string">"+"</span>, z, <span class="hljs-string">"="</span>, sonuc)

<span class="hljs-comment"># 5. Python'da fonksiyon kullanımı</span>
<span class="hljs-keyword">def</span> <span class="hljs-title function_">merhaba_de</span>():
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba!"</span>)

merhaba_de()

<span class="hljs-comment"># 6. Değişken scopeları</span>
x = <span class="hljs-number">5</span>  <span class="hljs-comment"># Global scope</span>

<span class="hljs-keyword">def</span> <span class="hljs-title function_">fonksiyon</span>():
    x = <span class="hljs-number">10</span>  <span class="hljs-comment"># Local scope</span>
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Local x:"</span>, x)

fonksiyon()
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Global x:"</span>, x)

<span class="hljs-comment"># 7. Python'da input kullanımı</span>
isim = <span class="hljs-built_in">input</span>(<span class="hljs-string">"Adınız nedir? "</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba"</span>, isim)

<span class="hljs-comment"># 8. Type casting</span>
sayi_str = <span class="hljs-string">"123"</span>
sayi = <span class="hljs-built_in">int</span>(sayi_str)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"String olarak:"</span>, sayi_str)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Integer olarak:"</span>, sayi)

<span class="hljs-comment"># 9. Python'da karşılaştırma ifadeleri</span>
a = <span class="hljs-number">5</span>
b = <span class="hljs-number">10</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a == b:"</span>, a == b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a != b:"</span>, a != b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &lt; b:"</span>, a &lt; b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &gt; b:"</span>, a &gt; b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &lt;= b:"</span>, a &lt;= b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &gt;= b:"</span>, a &gt;= b)

<span class="hljs-comment"># 10. Python'da şart ifadeleri</span>
yas = <span class="hljs-built_in">int</span>(<span class="hljs-built_in">input</span>(<span class="hljs-string">"Yaşınızı girin: "</span>))
<span class="hljs-keyword">if</span> yas &lt; <span class="hljs-number">18</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Reşit değilsiniz."</span>)
<span class="hljs-keyword">elif</span> yas &lt; <span class="hljs-number">65</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Çalışma yaşındasınız."</span>)
<span class="hljs-keyword">else</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Emekli yaşındasınız."</span>)

<span class="hljs-comment"># 11. Python'da type() kullanımı</span>
a = <span class="hljs-number">10</span>
b = <span class="hljs-string">"Merhaba"</span>
c = <span class="hljs-number">3.14</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a'nın tipi:"</span>, <span class="hljs-built_in">type</span>(a))
<span class="hljs-built_in">print</span>(<span class="hljs-string">"b'nin tipi:"</span>, <span class="hljs-built_in">type</span>(b))
<span class="hljs-built_in">print</span>(<span class="hljs-string">"c'nin tipi:"</span>, <span class="hljs-built_in">type</span>(c))

<span class="hljs-comment"># 12. Input validation</span>
<span class="hljs-keyword">while</span> <span class="hljs-literal">True</span>:
    <span class="hljs-keyword">try</span>:
        yas = <span class="hljs-built_in">int</span>(<span class="hljs-built_in">input</span>(<span class="hljs-string">"Yaşınızı girin: "</span>))
        <span class="hljs-keyword">if</span> yas &gt;= <span class="hljs-number">0</span>:
            <span class="hljs-keyword">break</span>
        <span class="hljs-keyword">else</span>:
            <span class="hljs-built_in">print</span>(<span class="hljs-string">"Lütfen pozitif bir sayı girin."</span>)
    <span class="hljs-keyword">except</span> ValueError:
        <span class="hljs-built_in">print</span>(<span class="hljs-string">"Lütfen geçerli bir sayı girin."</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Yaşınız:"</span>, yas)

<span class="hljs-comment"># 13. Python'da error handling</span>
<span class="hljs-keyword">try</span>:
    sonuc = <span class="hljs-number">10</span> / <span class="hljs-number">0</span>
<span class="hljs-keyword">except</span> ZeroDivisionError:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Sıfıra bölme hatası!"</span>)
<span class="hljs-keyword">finally</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Bu mesaj her zaman yazdırılır."</span>)

<span class="hljs-comment"># 14. Python'da kullanabileceğim önceden tanımlanmış hata tipleri</span>
<span class="hljs-keyword">try</span>:
    liste = [<span class="hljs-number">1</span>, <span class="hljs-number">2</span>, <span class="hljs-number">3</span>]
    <span class="hljs-built_in">print</span>(liste[<span class="hljs-number">5</span>])
<span class="hljs-keyword">except</span> IndexError:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Index hatası!"</span>)
<span class="hljs-keyword">except</span> ValueError:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Değer hatası!"</span>)
</code></div></div></pre><h3>15. Python'da döngüler</h3><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-comment"># 1. print() komutu</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba Dünya"</span>)

<span class="hljs-comment"># 2. print() içinde değişken kullanmadan number ve stringi beraber kullan</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Yaşım"</span>, <span class="hljs-number">25</span>)

<span class="hljs-comment"># 3. print kullanarak matematiksel işlemler yapma</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"3 + 5 ="</span>, <span class="hljs-number">3</span> + <span class="hljs-number">5</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"10 - 2 ="</span>, <span class="hljs-number">10</span> - <span class="hljs-number">2</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"4 * 7 ="</span>, <span class="hljs-number">4</span> * <span class="hljs-number">7</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"20 / 4 ="</span>, <span class="hljs-number">20</span> / <span class="hljs-number">4</span>)

<span class="hljs-comment"># 4. Değişken kullanarak string ve karmaşık matematiksel işlemin birleştirildiği örnekler</span>
x = <span class="hljs-number">10</span>
y = <span class="hljs-number">5</span>
z = <span class="hljs-number">2</span>
sonuc = x * y + z
<span class="hljs-built_in">print</span>(<span class="hljs-string">"İşlem: "</span>, x, <span class="hljs-string">"*"</span>, y, <span class="hljs-string">"+"</span>, z, <span class="hljs-string">"="</span>, sonuc)

<span class="hljs-comment"># 5. Python'da fonksiyon kullanımı</span>
<span class="hljs-keyword">def</span> <span class="hljs-title function_">merhaba_de</span>():
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba!"</span>)

merhaba_de()

<span class="hljs-comment"># 6. Değişken scopeları</span>
x = <span class="hljs-number">5</span>  <span class="hljs-comment"># Global scope</span>

<span class="hljs-keyword">def</span> <span class="hljs-title function_">fonksiyon</span>():
    x = <span class="hljs-number">10</span>  <span class="hljs-comment"># Local scope</span>
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Local x:"</span>, x)

fonksiyon()
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Global x:"</span>, x)

<span class="hljs-comment"># 7. Python'da input kullanımı</span>
isim = <span class="hljs-built_in">input</span>(<span class="hljs-string">"Adınız nedir? "</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba"</span>, isim)

<span class="hljs-comment"># 8. Type casting</span>
sayi_str = <span class="hljs-string">"123"</span>
sayi = <span class="hljs-built_in">int</span>(sayi_str)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"String olarak:"</span>, sayi_str)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Integer olarak:"</span>, sayi)

<span class="hljs-comment"># 9. Python'da karşılaştırma ifadeleri</span>
a = <span class="hljs-number">5</span>
b = <span class="hljs-number">10</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a == b:"</span>, a == b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a != b:"</span>, a != b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &lt; b:"</span>, a &lt; b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &gt; b:"</span>, a &gt; b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &lt;= b:"</span>, a &lt;= b)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a &gt;= b:"</span>, a &gt;= b)

<span class="hljs-comment"># 10. Python'da şart ifadeleri</span>
yas = <span class="hljs-built_in">int</span>(<span class="hljs-built_in">input</span>(<span class="hljs-string">"Yaşınızı girin: "</span>))
<span class="hljs-keyword">if</span> yas &lt; <span class="hljs-number">18</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Reşit değilsiniz."</span>)
<span class="hljs-keyword">elif</span> yas &lt; <span class="hljs-number">65</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Çalışma yaşındasınız."</span>)
<span class="hljs-keyword">else</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Emekli yaşındasınız."</span>)

<span class="hljs-comment"># 11. Python'da type() kullanımı</span>
a = <span class="hljs-number">10</span>
b = <span class="hljs-string">"Merhaba"</span>
c = <span class="hljs-number">3.14</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"a'nın tipi:"</span>, <span class="hljs-built_in">type</span>(a))
<span class="hljs-built_in">print</span>(<span class="hljs-string">"b'nin tipi:"</span>, <span class="hljs-built_in">type</span>(b))
<span class="hljs-built_in">print</span>(<span class="hljs-string">"c'nin tipi:"</span>, <span class="hljs-built_in">type</span>(c))

<span class="hljs-comment"># 12. Input validation</span>
<span class="hljs-keyword">while</span> <span class="hljs-literal">True</span>:
    <span class="hljs-keyword">try</span>:
        yas = <span class="hljs-built_in">int</span>(<span class="hljs-built_in">input</span>(<span class="hljs-string">"Yaşınızı girin: "</span>))
        <span class="hljs-keyword">if</span> yas &gt;= <span class="hljs-number">0</span>:
            <span class="hljs-keyword">break</span>
        <span class="hljs-keyword">else</span>:
            <span class="hljs-built_in">print</span>(<span class="hljs-string">"Lütfen pozitif bir sayı girin."</span>)
    <span class="hljs-keyword">except</span> ValueError:
        <span class="hljs-built_in">print</span>(<span class="hljs-string">"Lütfen geçerli bir sayı girin."</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Yaşınız:"</span>, yas)

<span class="hljs-comment"># 13. Python'da error handling</span>
<span class="hljs-keyword">try</span>:
    sonuc = <span class="hljs-number">10</span> / <span class="hljs-number">0</span>
<span class="hljs-keyword">except</span> ZeroDivisionError:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Sıfıra bölme hatası!"</span>)
<span class="hljs-keyword">finally</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Bu mesaj her zaman yazdırılır."</span>)

<span class="hljs-comment"># 14. Python'da kullanabileceğim önceden tanımlanmış hata tipleri</span>
<span class="hljs-keyword">try</span>:
    liste = [<span class="hljs-number">1</span>, <span class="hljs-number">2</span>, <span class="hljs-number">3</span>]
    <span class="hljs-built_in">print</span>(liste[<span class="hljs-number">5</span>])
<span class="hljs-keyword">except</span> IndexError:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Index hatası!"</span>)
<span class="hljs-keyword">except</span> ValueError:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Değer hatası!"</span>)

<span class="hljs-comment"># 15. Python'da döngüler</span>
<span class="hljs-keyword">for</span> i <span class="hljs-keyword">in</span> <span class="hljs-built_in">range</span>(<span class="hljs-number">5</span>):
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"for döngüsü:"</span>, i)

j = <span class="hljs-number">0</span>
<span class="hljs-keyword">while</span> j &lt; <span class="hljs-number">5</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"while döngüsü:"</span>, j)
    j += <span class="hljs-number">1</span>
</code></div></div></pre><h3>16. Python'da listeler</h3><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-comment"># 1. print() komutu</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Merhaba Dünya"</span>)

<span class="hljs-comment"># 2. print() içinde değişken kullanmadan number ve stringi beraber kullan</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Yaşım"</span>, <span class="hljs-number">25</span>)

<span class="hljs-comment"># 3. print kullanarak matematiksel işlemler yapma</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"3 + 5 ="</span>, <span class="hljs-number">3</span> + <span class="hljs-number">5</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"10 - 2 ="</span>, <span class="hljs-number">10</span> - <span class="hljs-number">2</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"4 * 7 ="</span>, <span class="hljs-number">4</span> * <span class="hljs-number">7</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"20 / 4 ="</span>, <span class="hljs-number">20</span> / <span class="hljs-number">4</span>)

<span class="hljs-comment"># 4. Değişken kullanarak string ve karmaşık matematiksel</span>
</code></div></div></pre>

---

**User:**
şimdi sadece bu 16 maddede belirtilenleri kullanarakanlamlı ve gerçek hayata uygun bir kod oluştur 

---

**ChatGPT:**
<p>Elbette, 16 maddede belirtilen konuları kullanarak anlamlı ve gerçek hayata uygun bir kod örneği oluşturalım. Bu kod, bir restoran sipariş sistemi olabilir. Kullanıcıdan sipariş alır, toplam fiyatı hesaplar, indirim uygular, ve sonunda sipariş özetini ekrana yazdırır.</p><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-comment"># 1. print() komutu</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Restoran Sipariş Sistemi"</span>)

<span class="hljs-comment"># 2. print() içinde değişken kullanmadan number ve stringi beraber kullan</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Hoşgeldiniz! Bugün menümüzde 3 çeşit yemek var."</span>)

<span class="hljs-comment"># 3. print kullanarak matematiksel işlemler yapma</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"1. Yemek: Tavuk - Fiyat: 10 TL"</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"2. Yemek: Balık - Fiyat: 20 TL"</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"3. Yemek: Vejetaryen - Fiyat: 15 TL"</span>)

<span class="hljs-comment"># 4. Değişken kullanarak string ve karmaşık matematiksel işlemin birleştirildiği örnekler</span>
tavuk_fiyat = <span class="hljs-number">10</span>
balik_fiyat = <span class="hljs-number">20</span>
vejetaryen_fiyat = <span class="hljs-number">15</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Tavuk ve Balık birlikte almak isterseniz toplam fiyat:"</span>, tavuk_fiyat + balik_fiyat, <span class="hljs-string">"TL"</span>)

<span class="hljs-comment"># 5. Python'da fonksiyon kullanımı</span>
<span class="hljs-keyword">def</span> <span class="hljs-title function_">indirim_hesapla</span>(<span class="hljs-params">tutar, indirim_orani</span>):
    indirim = tutar * indirim_orani / <span class="hljs-number">100</span>
    <span class="hljs-keyword">return</span> tutar - indirim

<span class="hljs-comment"># 6. Değişken scopeları</span>
global_siparis_tutari = <span class="hljs-number">0</span>

<span class="hljs-keyword">def</span> <span class="hljs-title function_">siparis_ekle</span>(<span class="hljs-params">fiyat</span>):
    <span class="hljs-keyword">global</span> global_siparis_tutari
    global_siparis_tutari += fiyat

<span class="hljs-comment"># 7. Python'da input kullanımı</span>
siparis = <span class="hljs-built_in">input</span>(<span class="hljs-string">"Siparişinizi seçin (1, 2, 3): "</span>)

<span class="hljs-comment"># 8. Type casting</span>
siparis = <span class="hljs-built_in">int</span>(siparis)

<span class="hljs-comment"># 9. Python'da karşılaştırma ifadeleri</span>
<span class="hljs-keyword">if</span> siparis == <span class="hljs-number">1</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Tavuk seçtiniz."</span>)
    siparis_ekle(tavuk_fiyat)
<span class="hljs-keyword">elif</span> siparis == <span class="hljs-number">2</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Balık seçtiniz."</span>)
    siparis_ekle(balik_fiyat)
<span class="hljs-keyword">elif</span> siparis == <span class="hljs-number">3</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Vejetaryen yemek seçtiniz."</span>)
    siparis_ekle(vejetaryen_fiyat)
<span class="hljs-keyword">else</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Geçersiz seçim."</span>)

<span class="hljs-comment"># 10. Python'da şart ifadeleri</span>
<span class="hljs-keyword">if</span> global_siparis_tutari &gt; <span class="hljs-number">0</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Sipariş tutarınız:"</span>, global_siparis_tutari, <span class="hljs-string">"TL"</span>)
    indirim_orani = <span class="hljs-number">10</span>
    odenecek_tutar = indirim_hesapla(global_siparis_tutari, indirim_orani)
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"İndirim uygulanmış tutar:"</span>, odenecek_tutar, <span class="hljs-string">"TL"</span>)
<span class="hljs-keyword">else</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Sipariş vermediniz."</span>)

<span class="hljs-comment"># 11. Python'da type() kullanımı</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"global_siparis_tutari değişkeninin tipi:"</span>, <span class="hljs-built_in">type</span>(global_siparis_tutari))

<span class="hljs-comment"># 12. Input validation</span>
<span class="hljs-keyword">while</span> <span class="hljs-literal">True</span>:
    <span class="hljs-keyword">try</span>:
        odeme_miktari = <span class="hljs-built_in">float</span>(<span class="hljs-built_in">input</span>(<span class="hljs-string">"Ödeme miktarını girin: "</span>))
        <span class="hljs-keyword">if</span> odeme_miktari &gt;= <span class="hljs-number">0</span>:
            <span class="hljs-keyword">break</span>
        <span class="hljs-keyword">else</span>:
            <span class="hljs-built_in">print</span>(<span class="hljs-string">"Lütfen pozitif bir sayı girin."</span>)
    <span class="hljs-keyword">except</span> ValueError:
        <span class="hljs-built_in">print</span>(<span class="hljs-string">"Lütfen geçerli bir sayı girin."</span>)

<span class="hljs-comment"># 13. Python'da error handling</span>
<span class="hljs-keyword">try</span>:
    para_ustu = odeme_miktari - odenecek_tutar
    <span class="hljs-keyword">if</span> para_ustu &lt; <span class="hljs-number">0</span>:
        <span class="hljs-keyword">raise</span> ValueError(<span class="hljs-string">"Yetersiz ödeme."</span>)
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Para üstünüz:"</span>, para_ustu, <span class="hljs-string">"TL"</span>)
<span class="hljs-keyword">except</span> ValueError <span class="hljs-keyword">as</span> e:
    <span class="hljs-built_in">print</span>(e)

<span class="hljs-comment"># 14. Python'da kullanabileceğim önceden tanımlanmış hata tipleri</span>
<span class="hljs-keyword">try</span>:
    liste = [<span class="hljs-number">1</span>, <span class="hljs-number">2</span>, <span class="hljs-number">3</span>]
    <span class="hljs-built_in">print</span>(liste[<span class="hljs-number">5</span>])
<span class="hljs-keyword">except</span> IndexError:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Index hatası!"</span>)
<span class="hljs-keyword">except</span> ValueError:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Değer hatası!"</span>)

<span class="hljs-comment"># 15. Python'da döngüler</span>
<span class="hljs-keyword">for</span> i <span class="hljs-keyword">in</span> <span class="hljs-built_in">range</span>(<span class="hljs-number">3</span>):
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Teşekkürler!"</span>, i + <span class="hljs-number">1</span>)

j = <span class="hljs-number">0</span>
<span class="hljs-keyword">while</span> j &lt; <span class="hljs-number">3</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Yine bekleriz!"</span>, j + <span class="hljs-number">1</span>)
    j += <span class="hljs-number">1</span>

<span class="hljs-comment"># 16. Python'da listeler</span>
menu = [<span class="hljs-string">"Tavuk"</span>, <span class="hljs-string">"Balık"</span>, <span class="hljs-string">"Vejetaryen"</span>]
<span class="hljs-keyword">for</span> yemek <span class="hljs-keyword">in</span> menu:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Menüdeki yemek:"</span>, yemek)
</code></div></div></pre><p><strong>Kod Açıklaması:</strong></p><ul><li>Bu kod, basit bir restoran sipariş sistemi simüle eder.</li><li>Kullanıcıdan hangi yemeği istediğini sorar ve sipariş toplamını hesaplar.</li><li>Bir indirim uygular ve ödeme alır.</li><li>Kullanıcının girdiği ödeme miktarını kontrol eder ve para üstü hesaplar.</li><li>Menüdeki yemekleri listeleyerek döngü ve liste kullanımını gösterir.</li></ul><p>Bu kod, verilen 16 maddeyi kapsayarak anlamlı ve gerçek hayatta kullanılabilir bir örnek oluşturur.</p>

---

**User:**
Continue writing please

---

**ChatGPT:**
<p>Certainly! Let's continue from where we left off and add more functionalities to this restaurant order system:</p><pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>python</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-python"><span class="hljs-comment"># 1. print() command</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Restaurant Order System"</span>)

<span class="hljs-comment"># 2. Using numbers and strings together in print() without variables</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"Welcome! Today we have 3 types of meals available."</span>)

<span class="hljs-comment"># 3. Using print() for mathematical operations</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"1. Chicken - Price: 10 TL"</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"2. Fish - Price: 20 TL"</span>)
<span class="hljs-built_in">print</span>(<span class="hljs-string">"3. Vegetarian - Price: 15 TL"</span>)

<span class="hljs-comment"># 4. Using variables to combine strings and complex mathematical operations</span>
chicken_price = <span class="hljs-number">10</span>
fish_price = <span class="hljs-number">20</span>
vegetarian_price = <span class="hljs-number">15</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"If you buy Chicken and Fish together, the total price is:"</span>, chicken_price + fish_price, <span class="hljs-string">"TL"</span>)

<span class="hljs-comment"># 5. Using functions in Python</span>
<span class="hljs-keyword">def</span> <span class="hljs-title function_">calculate_discount</span>(<span class="hljs-params">total, discount_rate</span>):
    discount = total * discount_rate / <span class="hljs-number">100</span>
    <span class="hljs-keyword">return</span> total - discount

<span class="hljs-comment"># 6. Variable scopes</span>
global_order_total = <span class="hljs-number">0</span>

<span class="hljs-keyword">def</span> <span class="hljs-title function_">add_to_order</span>(<span class="hljs-params">price</span>):
    <span class="hljs-keyword">global</span> global_order_total
    global_order_total += price

<span class="hljs-comment"># 7. Using input() in Python</span>
order = <span class="hljs-built_in">input</span>(<span class="hljs-string">"Please select your order (1, 2, 3): "</span>)

<span class="hljs-comment"># 8. Type casting</span>
order = <span class="hljs-built_in">int</span>(order)

<span class="hljs-comment"># 9. Comparison statements in Python</span>
<span class="hljs-keyword">if</span> order == <span class="hljs-number">1</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"You selected Chicken."</span>)
    add_to_order(chicken_price)
<span class="hljs-keyword">elif</span> order == <span class="hljs-number">2</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"You selected Fish."</span>)
    add_to_order(fish_price)
<span class="hljs-keyword">elif</span> order == <span class="hljs-number">3</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"You selected Vegetarian."</span>)
    add_to_order(vegetarian_price)
<span class="hljs-keyword">else</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Invalid selection."</span>)

<span class="hljs-comment"># 10. Conditional statements in Python</span>
<span class="hljs-keyword">if</span> global_order_total &gt; <span class="hljs-number">0</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Your order total is:"</span>, global_order_total, <span class="hljs-string">"TL"</span>)
    discount_rate = <span class="hljs-number">10</span>
    total_after_discount = calculate_discount(global_order_total, discount_rate)
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Total after discount:"</span>, total_after_discount, <span class="hljs-string">"TL"</span>)
<span class="hljs-keyword">else</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"You did not place an order."</span>)

<span class="hljs-comment"># 11. Using type() in Python</span>
<span class="hljs-built_in">print</span>(<span class="hljs-string">"The type of global_order_total is:"</span>, <span class="hljs-built_in">type</span>(global_order_total))

<span class="hljs-comment"># 12. Input validation</span>
<span class="hljs-keyword">while</span> <span class="hljs-literal">True</span>:
    <span class="hljs-keyword">try</span>:
        payment_amount = <span class="hljs-built_in">float</span>(<span class="hljs-built_in">input</span>(<span class="hljs-string">"Enter the payment amount: "</span>))
        <span class="hljs-keyword">if</span> payment_amount &gt;= <span class="hljs-number">0</span>:
            <span class="hljs-keyword">break</span>
        <span class="hljs-keyword">else</span>:
            <span class="hljs-built_in">print</span>(<span class="hljs-string">"Please enter a positive number."</span>)
    <span class="hljs-keyword">except</span> ValueError:
        <span class="hljs-built_in">print</span>(<span class="hljs-string">"Please enter a valid number."</span>)

<span class="hljs-comment"># 13. Error handling in Python</span>
<span class="hljs-keyword">try</span>:
    change = payment_amount - total_after_discount
    <span class="hljs-keyword">if</span> change &lt; <span class="hljs-number">0</span>:
        <span class="hljs-keyword">raise</span> ValueError(<span class="hljs-string">"Insufficient payment."</span>)
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Your change is:"</span>, change, <span class="hljs-string">"TL"</span>)
<span class="hljs-keyword">except</span> ValueError <span class="hljs-keyword">as</span> e:
    <span class="hljs-built_in">print</span>(e)

<span class="hljs-comment"># 14. Predefined error types in Python</span>
<span class="hljs-keyword">try</span>:
    sample_list = [<span class="hljs-number">1</span>, <span class="hljs-number">2</span>, <span class="hljs-number">3</span>]
    <span class="hljs-built_in">print</span>(sample_list[<span class="hljs-number">5</span>])
<span class="hljs-keyword">except</span> IndexError:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Index error!"</span>)
<span class="hljs-keyword">except</span> ValueError:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Value error!"</span>)

<span class="hljs-comment"># 15. Loops in Python</span>
<span class="hljs-keyword">for</span> i <span class="hljs-keyword">in</span> <span class="hljs-built_in">range</span>(<span class="hljs-number">3</span>):
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Thank you!"</span>, i + <span class="hljs-number">1</span>)

j = <span class="hljs-number">0</span>
<span class="hljs-keyword">while</span> j &lt; <span class="hljs-number">3</span>:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Please visit us again!"</span>, j + <span class="hljs-number">1</span>)
    j += <span class="hljs-number">1</span>

<span class="hljs-comment"># 16. Lists in Python</span>
menu = [<span class="hljs-string">"Chicken"</span>, <span class="hljs-string">"Fish"</span>, <span class="hljs-string">"Vegetarian"</span>]
<span class="hljs-keyword">for</span> item <span class="hljs-keyword">in</span> menu:
    <span class="hljs-built_in">print</span>(<span class="hljs-string">"Menu item:"</span>, item)
</code></div></div></pre><p><strong>Explanation:</strong></p><ul><li>This extended code continues from the previous example and incorporates all the required concepts to create a meaningful and real-world applicable program.</li><li>The program simulates a simple restaurant order system, where the user can select a meal, view the total cost, and apply a discount.</li><li>It handles user input for the order selection and payment amount, performs error handling, and prints the appropriate messages.</li><li>The code demonstrates the use of functions, variable scopes, input validation, error handling, loops, and lists in Python.</li></ul><p>This complete program can be used as a practical example in a Python lesson to illustrate various fundamental programming concepts.</p>