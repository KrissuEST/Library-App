## Projekti info

Antud projekt on Java Spring Boot ja React ühe Udemy koolituse tulemus. <br/>
Raamatute laenutamise projekt millega kasutaja saab raamatuid otsida, neid valida oma riiulisse. <br/>
Samuti saab pikendada raamatu tagastamise tähtaega. Admin kasutajale teate saata. <br/>
Admin kasutajat praegu realiseeritud pole! Saab anda raamatutele hinnanguid 5 tärni süsteemis. <br/>
Kirjutada raamatutele tagasisidet. Rakendusel on ka Home leht. Saab laenutatud raamatu <br/>
riiulist tagasi panna. Tekib eraldi vaheleht kus näeb laenutuste ajalugu. <br/>
Kasutajaga saab sisse logida ja talle genereeritakse Jwt. Selleks kasutatakse Auth0 platvormi. <br/>
Auth0 platvormil saab kasutajaid hallata, lisada, kustutada. Muudab kasutate süsteemi turvalisemaks. <br/>
Antud lahendus on *responsive* ehk näeb samuti mobiilis hea välja.

### Projekti käivitamine

Arvutis peab olema Java JDK ja Node.js installeeritud. Lombok peab olema arendusvahendis seadistatud, <br/>
*Front-end* osa lisada eraldi projektina, kasutada selleks näiteks Visual Studio Code, <br/>
käivitada olles antud kaustas: git\Library-App\front-end\react-library ja kasutada käsku **npm start** <br/>
*Back-end* osa lisada eraldi projektina, kasutada selleks näiteks IntelliJ IDEA Community Edition, <br/>
käivitada olles failis: SpringBootLibraryApplication.java ja main meetodi peal **Run SpringBootLibr...** <br/>
Käivitab rakenduse arendusrežiimis. Avada aadressil: [http://localhost:3000](http://localhost:3000)

### Andmebaasi seadistus

Kui andmebaas esimest korda käivitada siis võiks käivitada kõik 5 skripti antud kaustast: git\Library-App\01-starter-files\Scripts <br/>
Rakenduses on siis vähemalt olemas raamatud mille vahelt valida ehk baasandmed. <br/>
Andmebaasi kasutaja ja parooli leiab back-end osa application.properties failist. <br/>
Võib kasutada MySQL Workbench 8.0 programmi andmebaasi vaatamiseks, sisse logimiseks ja selle lisamiseks. <br/>
Läbi MySQL Workbench-i on ka väga hea skripte käivitada!

### Rakendusse sisse logimine

Käib hetkel vaid ühe kasutajaga: testuser@email.com <br/>
Parool: Test1234!

### Autor

Kristjan Tõnismäe