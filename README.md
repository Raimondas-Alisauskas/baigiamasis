																Kursas: Java-0730 Andrius Prišmantas

					Vaizdų atpažinimo tinklo analitika

    Ši programa skirta generuoti bei vizualizuoti (analizuoti) Convolution Network (vaizdų atpažinimo Neural-net) 
    parametrus pagal pageidavimą, nusakančius modelio efektyvumą: recall, accuracy, precision, f1 ir kt.
	Aplikacija yra sudaryta iš keturių klasių. Klasių aprašai pagal hierarchiją:
1. Analitics
Ši klasė randasi hierarchijos viršuje. Joje naudojamas org.math.plot.PlotPanel modulis. Ji paima reikiamus modelio duomenis ir gali juos vizualizuoti įvairiais būdais (2d , 3d, scatter, line ir kt.). Iš šios klasės paleidžiamas kodas.
2. Plot2
Ši klasė panašiai kaip ir Analitics ima modelio duomenis ir juos vizualizuoja naudojant JFreeChart modulį. Nuo anksčiau minėtos klasės ši klasė skiriasi tuo, jog yra mažiau lanksti gaunant vizualizavimo duomenis bei naudoja sudėtingesnį vizualizavimo kodą. Iš šios klasės paleidžiamas kodas.
3. ConvModel
Šioje klasėje sukuriamas Convolution modelis (metodu createModel), užduodamas reikiamas parametrų grid’as, kurį iteruojant renkami modelio duomenys; jie veliau naudojami vizualizavime. Klasė naudoja deeplearning4j paketą. Patogesniam darbui su duomenimis suprogramuoti gaunamų parametrų getter’iai. Konkrečiai šiuo atveju parametrų tinklas sudarytas iš 2 parametrų: sample size (vaizdų skaičius naudojamas treniravimuisi bei testavimui) bei learning rate (mokymosi greitis).
4. SortRange
Į šią klasę sudėti pagalbiniai metodai darbui su duomenimis, grid’o sukūrimui, double reikšmių masyvų apvalinimui, įvairios masyvų rūšiavimo implementacijos: range(start, stop, step), round_(ArrayList), sort(ArrayList).
