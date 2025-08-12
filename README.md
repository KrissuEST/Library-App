## Projekti info

Antud projekt on Java Spring Boot ja React Udemy koolituse tulemus. <br/>
Raamatute laenutamise projekt millega kasutaja saab raamatuid otsida, neid valida oma riiulisse. <br/>
ehk laenutada, saab laenutuse tähtaega pikendada või raamatu tagastada. Projektil on ka testandmed. <br/>
Kasutajaga saab sisse logida ja talle genereeritakse Jwt. Selleks kasutatakse Auth0 platvormi. <br/>
Auth0 platvormil saab kasutajaid hallata, lisada, kustutada. Muudab kasutate süsteemi turvalisemaks. <br/>
Antud lahendus on *responsive* ehk näeb samuti mobiilis hea välja. Viimasena realiseerisin HTTPS osa.

### Admin kasutaja

Admin kasutaja on realiseeritud! Ehk Admin on rakenduse peakasutaja. Ta saab raamatuid lisada <br/>
ja kustutada, vastata kasutaja sõnumitele. Samuti muuta või vähendada raamatute hulka. <br/>
Uute raamatute lisamisel on raamatu pildid kaustas: git\Library-App\01-starter-files\Images\BooksImages <br/>
Saab sisse logida: adminuser@email.com <br/>
Parool: Test4321!

### Tavakasutaja

Tavakasutaja saab anda raamatutele hinnanguid 5 tärni süsteemis. <br/>
Kirjutada raamatutele tagasisidet. Saab laenutatud raamatu riiulist tagasi panna. <br/>
Tekib eraldi vaheleht kus näeb laenutuste ajalugu. <br/>
Samuti saab pikendada raamatu tagastamise tähtaega. Admin kasutajale teate saata. <br/>
Saab sisse logida vaid ühega: testuser@email.com <br/>
Parool: Test1234!

### HTTPS

HTTPS sai viimasena realiseeritud, genereerisin võtme ja oma allkirjastatud sertifikaadi. <br/>
Ehk kogu rakendus on HTTPS-ile üle viidud ja kasutab seda. Kui rakendus annab mingi hoiatuse <br/>
veebibrauseril siis seda võib ignoreerida. Nagu näiteks sellised teated: <br/>
![Warning](https://github.com/user-attachments/assets/0f85f9e5-227d-4d51-acd4-0458dfa9146a)

### Projekti käivitamine

Arvutis peab olema Java JDK ja Node.js installeeritud. Lombok peab olema arendusvahendis seadistatud, <br/>
*Front-end* osa lisada eraldi projektina, kasutada selleks näiteks Visual Studio Code, <br/>
käivitada olles antud kaustas: git\Library-App\front-end\react-library ja kasutada käsku **npm start** <br/>
*Back-end* osa lisada eraldi projektina, kasutada selleks näiteks IntelliJ IDEA Community Edition, <br/>
käivitada olles failis: SpringBootLibraryApplication.java ja main meetodi peal **Run SpringBootLibr...** <br/>
Käivitab rakenduse arendusrežiimis. Avada aadressil: [https://localhost:3000](https://localhost:3000)

### Andmebaasi seadistus

Kui andmebaas esimest korda käivitada siis võiks käivitada kõik 5 skripti antud kaustast: <br/>
git\Library-App\01-starter-files\Scripts <br/>
Rakenduses on siis vähemalt olemas raamatud mille vahelt valida ehk baasandmed. <br/>
Andmebaasi kasutaja ja parooli leiab *back-end* osa application.properties failist. <br/>
Võib kasutada MySQL Workbench 8.0 programmi andmebaasi vaatamiseks, sisse logimiseks ja selle lisamiseks. <br/>
Läbi MySQL Workbench-i on ka väga hea skripte käivitada!

### Autor

Kristjan Tõnismäe