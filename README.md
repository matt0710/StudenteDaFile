# StudenteDaFile
Si consideri una directory chiamata STUDENTI contenente 5 file, ciascuno afferente ad uno studente
del Politecnico di Bari.
Ogni file contiene (un campo per riga) nome, cognome e matricola delle studente di riferimento; ogni
matricola, usata come nome del file relativo, inizia con la lettera “M” ed è seguita da 6 cifre.
Si implementi in Java un programma che crei un array di Studente a partire dai dati contenuti nei
suddetti file; Studente è una classe che estende Persona.
La classe Persona è formata dagli attributi nome e cognome, Studente dall’attributo matricola. Per
ciascuna di esse si implementino i getter e i setter.
Si ordini l’array generato secondo la matricola degli studenti.
L’eccezione BadMatricolaException viene lanciata nel caso in cui la matricola non inizi con la lettera
“M”.
