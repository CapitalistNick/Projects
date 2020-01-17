package surveyZip2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class surveyZip {

	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "\\\\File01\\HOME\\nsajna\\Desktop\\FHM Survey 1-4 - 1-10\\ZipCodes.txt";
		File file = new File(fileName);
		Scanner scanner = new Scanner(file);
		List<String> pinellasArea = new ArrayList<String>(); 
		List<String>tampaArea = new ArrayList<String>();
		List<String> alachuaArea = new ArrayList<String>();
		List<String> bakerArea = new ArrayList<String>();
		List<String> bayArea = new ArrayList<String>();
		List<String> bradFordArea = new ArrayList<String>();
		List<String> brevardArea = new ArrayList<String>();
		List<String> browardArea = new ArrayList<String>();
		List<String> calhounArea = new ArrayList<String>();
		List<String> charlotteArea = new ArrayList<String>();
		List<String> citrusArea = new ArrayList<String>();
		List<String> clayArea = new ArrayList<String>();
		List<String> collierArea = new ArrayList<String>();
		List<String> columbiaArea = new ArrayList<String>();
		List<String> deSotoArea = new ArrayList<String>();
		List<String> dixieArea = new ArrayList<String>();
		List<String> duvalArea = new ArrayList<String>();
		List<String> escambiaArea = new ArrayList<String>();
		List<String> flaglerArea = new ArrayList<String>();
		List<String> franklinArea = new ArrayList<String>();
		List<String> gadsdenArea = new ArrayList<String>();
		List<String> gilchristArea = new ArrayList<String>();
		List<String> gladesArea = new ArrayList<String>();
		List<String> gulfArea = new ArrayList<String>();
		List<String> hamiltonArea = new ArrayList<String>();
		List<String> hardeeArea = new ArrayList<String>();
		List<String> hendryArea = new ArrayList<String>();
		List<String> hernandoArea = new ArrayList<String>();
		List<String> highlandsArea = new ArrayList<String>();
		List<String> holmesArea = new ArrayList<String>();
		List<String> indianRiverArea = new ArrayList<String>();
		List<String> jacksonArea = new ArrayList<String>();
		List<String> jeffersonArea = new ArrayList<String>();
		List<String> lafayetteArea = new ArrayList<String>();
		List<String> lakeArea = new ArrayList<String>();
		List<String> leeArea = new ArrayList<String>();
		List<String> leonArea = new ArrayList<String>();
		List<String> levyArea = new ArrayList<String>();
		List<String> libertyArea = new ArrayList<String>();
		List<String> madisonArea = new ArrayList<String>();
		List<String> manateeArea = new ArrayList<String>();
		List<String> marionArea = new ArrayList<String>();
		List<String> martinArea = new ArrayList<String>();
		List<String> MiamiDadeArea = new ArrayList<String>();
		List<String> monroeArea = new ArrayList<String>();
		List<String> nassauArea = new ArrayList<String>();
		List<String> okaloosaArea = new ArrayList<String>();
		List<String> okeechobeeArea = new ArrayList<String>();
		List<String> orangeArea = new ArrayList<String>();
		List<String> osceolaArea = new ArrayList<String>();
		List<String> palmBeachArea = new ArrayList<String>();
		List<String> pascoArea = new ArrayList<String>();
		List<String> polkArea = new ArrayList<String>();
		List<String> putnamArea = new ArrayList<String>();
		List<String> saintJohnsArea = new ArrayList<String>();
		List<String> saintLucieArea = new ArrayList<String>();
		List<String> santaRosaArea = new ArrayList<String>();
		List<String> sarasotaArea = new ArrayList<String>();
		List<String> seminoleArea = new ArrayList<String>();
		List<String> sumterArea = new ArrayList<String>();
		List<String> suwanneeArea = new ArrayList<String>();
		List<String> taylorArea = new ArrayList<String>();
		List<String> unionArea = new ArrayList<String>();
		List<String> volusiaArea = new ArrayList<String>();
		List<String> wakullaArea = new ArrayList<String>();
		List<String> waltonArea = new ArrayList<String>();
		List<String> washingtonArea = new ArrayList<String>();
		List<String> outsideofTampaBay = new ArrayList<String>();
		List<String> tampabayArea = new ArrayList<String>();
		List<String> outsideofFlorida = new ArrayList<String>();
		
		scanner.next();
		while(scanner.hasNext())
		{
			String data = scanner.nextLine();
			List<String> Alachua= Arrays.asList("32601","32602", "32603", "32604", "32605", "32606", "32607", "32608", "32609", "32610", "32611","32612", "32613", "32614", "32615", "32616", "32618", "32627", "32631", "32633", "32635", "32640", "32641", "32643", "32653", "32654", "32655", "32658", "32662", "32667", "32669", "32694");
			List<String> Baker = Arrays.asList("32040", "32063", "32072","32087");
			List<String> Bay = Arrays.asList("32401", "32402", "32403", "32404","32405", "32406", "32407", "32408", "32409", "32410", "32411", "32412", "32413", "32417", "32438", "32444", "32466");
			List<String> Bradford = Arrays.asList("32042", "32044", "32058", "32091", "32622");
			List<String> Brevard = Arrays.asList("32754",	
					"32775",	
					"32780",	                             
					"32781",	
					"32782",	
					"32783",	
					"32796",	
					"32815",	
					"32899",	
					"32901",	
					"32902",	
					"32903",	
					"32904",	
					"32905",	
					"32906",	
					"32907",	
					"32908",	
					"32909",	
					"32910",	
					"32911",	
					"32912",	
					"32919",	
					"32920",	
					"32922",	
					"32923",	
					"32924",	
					"32925",	
					"32926",	
					"32927",	
					"32931",	
					"32932",	
					"32934",	
					"32935",	
					"32936",	
					"32937",	
					"32940",	
					"32941",	
					"32949",	
					"32950",	
					"32951",	
					"32952",	
					"32953",	
					"32954",	
					"32955",	
					"32956",	
					"32959",	
					"32976");
			List<String> Broward = Arrays.asList("33004",	
					"33008",	
					"33009",	
					"33019",	
					"33020",	
					"33021",	
					"33022",	
					"33023",	
					"33024",	
					"33025",	
					"33026",	
					"33027",	
					"33028",	
					"33029",	
					"33060",	
					"33061",	
					"33062",	
					"33063",	
					"33064",	
					"33065",	
					"33066",	
					"33067",	
					"33068",	
					"33069",	
					"33071",	
					"33072",	
					"33073",	
					"33074",	
					"33075",	
					"33076",	
					"33077",	
					"33081",	
					"33082",		
					"33083",	
					"33084",	
					"33093",	
					"33093",	
					"33097",	
					"33301",	
					"33302",	
					"33303",	
					"33304",	
					"33305",	
					"33306",	
					"33307",	
					"33308",	
					"33309",	
					"33310",	
					"33311",	
					"33312",	
					"33313",	
					"33314",	
					"33315",	
					"33316",	
					"33317",	
					"33318",	
					"33319",	
					"33320",	
					"33321",	
					"33322",	
					"33323",	
					"33324",	
					"33325",	
					"33326",	
					"33327",	
					"33328",	
					"33329",	
					"33330",	
					"33331",	
					"33332",	
					"33334",	
					"33335",	
					"33336",	
					"33337",	
					"33338",	
					"33339",	
					"33340",	
					"33345",	
					"33346",	
					"33348",	
					"33349",	
					"33351",	
					"33355",	
					"33359",	
					"33388",	
					"33394",	
					"33441",	
					"33442",	
					"33443");
			List<String> Calhoun = Arrays.asList("32421","32424", "32430", "32449" );
			List<String> Charlotte = Arrays.asList("33927", "33938", "33946", "33947", "33948", "33949", "33950", "33951", "33952", "33953", "33954", "33955", "33980", "33981", "33982", "33983", "34224");
			List<String> Citrus = Arrays.asList("34423", "34428", "34429","34433", "34434", "34442", "34445", "34446", "34447", "34448", "34450", "34451" , "34452", "34453", "34460", "34461", "34464", "34465", "34487");
			List<String> Clay = Arrays.asList("32003", "32006", "32030", "32043", "32050", "32065", "32067", "32068", "32073", "32079", "32160", "32656");
			List<String> Collier = Arrays.asList("34101", "34102", "34103", "34104", "34105", "34106", "34107", "34108", "34109", "34110", "34112", "34113", "34114", "34116", "34117", "34119", "34120", "34137", "34138", "34139", "34140", "34142", "34143", "34145", "34146");
			List<String> Columbia = Arrays.asList("32024", "32025", "32038", "32055", "32056", "32061");
			List<String> DeSoto = Arrays.asList("34256", "34266", "34267", "34268", "34269");
			List<String> Dixie = Arrays.asList("32628", "32648", "32680", "32692");
			List<String> Duval = Arrays.asList("32099", "32201", "32202", "32203", "32204", "32205", "32206","32207", "32208", "32209", "32210","32211", "32214", "32215", "32216", "32217", "32218", "32219", "32220","32221","32222", "32223","32224","32225","32226","32227","32228","32229","32230","32231","32232","32233","32234","32235","32236","32237","32238","32239", "32240","32241","32244","32245","32246","32247","32250","32254","32255","32256","32257","32258","32266","32267","32277","32290");
			List<String> Escambia = Arrays.asList("32501","32502","32503","32504","32505","32506","32507","32508","32509","32511","32512","32513","32514","32516","32520","32521","32522","32523","32524","32526","32533","32534","32535","32559","32560","32568","32577","32590","32591","32592");
			List<String> Flagler = Arrays.asList("32110", "32135", "32136", "32137","32142", "32164");
			List<String> Franklin = Arrays.asList("32320","32322","32323","32328","32329");
			List<String> Gadsden = Arrays.asList("32324","32330","32332","32333","32343","32351","32352","32353");
			List<String> Gilchrist = Arrays.asList("32619","32693");
			List<String> Glades = Arrays.asList("33471","33944");
			List<String> Gulf = Arrays.asList("32456","32457","32465");
			List<String> Hamilton = Arrays.asList("32052","32053","32096");
			List<String> Hardee = Arrays.asList("33834","33865","33873","33890");
			List<String> Hendry = Arrays.asList("33440","33930","33935","33975");
			List<String> Hernando = Arrays.asList("34601","34602","34603","34604","34605","34606","34607","34608","34609","34611","34613","34614","34636","34661");
			List<String> Highlands = Arrays.asList("33825","33826","33852","33857","33862","33870","33871","33872","33875","33876","33960");
			List<String> Holmes = Arrays.asList("32425","32452","32464");
			List<String> IndianRiver = Arrays.asList("32948","32957","32958","32960","32961","32962","32963","32964","32965","32966","32967","32968","32969","32970","32971","32978");
			List<String> Jackson = Arrays.asList("32420","32423","32426","32431","32440","32442","32443","32445","32446","32447","32448","32460");
			List<String> Jefferson = Arrays.asList("32336","32337","32344","32345","32361");
			List<String> Lafayette = Arrays.asList("32013","32066");
			List<String> Lake = Arrays.asList("32102","32158","32159","32702","32726","32727","32735","32736","32756","32757","32767","32776","32778","32784","34705","34711","34712","34713","34714","34715","34729","34731","34736","34737","34748","34749","34753","34755","34756","34762","34788","34789","34797");
			List<String> Lee = Arrays.asList("33901","33902","33903","33904","33905","33906","33907","33908","33909","33910","33911","33912","33913","33914","33915","33916","33917","33918","33919","33920","33921","33922","33924","33928","33931","33932","33936","33945","33956","33957","33965","33966","33967","33970","33971","33972","33990","33991","33993","33994","34133","34134","34135","34136");
			List<String> Leon = Arrays.asList("32301","32302","32303","32304","32305","32306","32307","32308","32309","32310","32311","32312","32313","32314","32315","32316","32317","32318","32362","32395","32399");
			List<String> Levy = Arrays.asList("32621","32625","32626","32639","32644","32668","32683","32696","34449","34498");
			List<String> Liberty = Arrays.asList("32321","32334","32335","32360");
			List<String> Madison = Arrays.asList("32059","32331","32340","32341","32350");
			List<String> Manatee = Arrays.asList("34201","34202","34203","34204","34205","34206","34207","34208","34209","34210","34211","34212","34215","34216","34217","34218","34219","34220","34221","34222","34228","34243","34250","34251","34260","34264","34270","34280","34281","34282");
			List<String> Marion = Arrays.asList("32111", "32113", "32133", "32134", "32179", "32182", "32183", "32192", "32195","32617", "32634", "32663", "32664", "32681","34420","34421","34430", "34431","34432","34470","34471","34472","34473","34474","34475","34476","34477","34478","34479","34480","34482","34483","34488","34489","34491","34492");
			List<String> Martin = Arrays.asList("33455", "33475", "34956", "34957", "34958","34990", "34991", "34992", "34994","34995","34996","34997");
			List<String> MiamiDade = Arrays.asList("33002",	
					"33010",	
					"33011",	
					"33012",	
					"33013",	
					"33014",	
					"33015",	
					"33016",	
					"33017",	
					"33018",	
					"33030",	
					"33031",	
					"33032",	
					"33033",	
					"33034",	
					"33035",	
					"33039",	
					"33054",	
					"33055",	
					"33056",	
					"33090",	
					"33092",	
					"33101",	
					"33102",	
					"33107",	
					"33109",	
					"33110",	
					"33111",	
					"33112",	
					"33114",	
					"33116",	
					"33119",	
					"33121",	
					"33122",	
					"33124",	
					"33125",	
					"33126",	
					"33127",	
					"33128",	
					"33129",	
					"33130",	
					"33131",	
					"33132",	
					"33133",	
					"33134",	
					"33135",	
					"33136",	
					"33137",	
					"33138",	
					"33139",	
					"33140",	
					"33141",	
					"33142",	
					"33143",	
					"33144",	
					"33145",	
					"33146",	
					"33147",	
					"33148",
					"33149",	
					"33150",	
					"33151",	
					"33152",	
					"33153",	
					"33154",	
					"33155",	
					"33156",	
					"33157",	
					"33158",	
					"33159",	
					"33160",	
					"33161",	
					"33162",
					"33163",	
					"33164",	
					"33165",	
					"33166",	
					"33167",	
					"33168",	
					"33169",	
					"33170",	
					"33172",	
					"33173",	
					"33174",	
					"33175",	
					"33176",	
					"33177",	
					"33178",	
					"33179",	
					"33180",	
					"33181",	
					"33182",	
					"33183",	
					"33184",	
					"33185",	
					"33186",	
					"33187",	
					"33188",	
					"33189",	
					"33190",	
					"33193",	
					"33194",	
					"33195",	
					"33196",	
					"33197",	
					"33199",	
					"33231",	
					"33233",	
					"33234",	
					"33238",	
					"33239",	
					"33242",	
					"33243",	
					"33245",	
					"33247",	
					"33255",	
					"33256",	
					"33257",	
					"33261",	
					"33265",	
					"33266",	
					"33269",	
					"33280",	
					"33283",	
					"33296",	
					"33299",	
					"34141"	);
			
			List<String> Monroe= Arrays.asList("33001","33036","33037","33040","33041","33042","33043","33045","33050","33051","33052","33070");
			List<String> Nassau= Arrays.asList("32009","32011","32034","32035","32041","32046","32097");
			List<String> Okaloosa= Arrays.asList("32531", "32536","32537","32539","32540","32541","32542","32544","32547","32548","32549","32564","32567","32569","32578","32579","32580","32588");
			List<String> Okeechobee= Arrays.asList("34972","34973","34974");
			List<String> Orange= Arrays.asList("32703",	
					"32704",	
					"32709",	
					"32710",	
					"32712",	
					"32751",	
					"32768",	
					"32777",	
					"32789",	
					"32790",	
					"32792",	
					"32793",	
					"32794",	
					"32798",	
					"32801",	
					"32802",
					"32803",	
					"32804",	
					"32805",
					"32806",	
					"32807",	
					"32808",	
					"32809",	
					"32810",	
					"32811",	
					"32812",	
					"32814",	
					"32816",	
					"32817",	
					"32818",	
					"32819",	
					"32820",	
					"32821",	
					"32822",	
					"32824",	
					"32825",	
					"32826",	
					"32827",	
					"32828",	
					"32829",	
					"32830",	
					"32831",
					"32832",	
					"32833",	
					"32834",	
					"32835",	
					"32836",	
					"32837",	
					"32839",	
					"32853",	
					"32854",	
					"32855",	
					"32856",	
					"32857",	
					"32858",	
					"32859",	
					"32860",	
					"32861",	
					"32862",	
					"32867",	
					"32868",	
					"32869",	
					"32872",	
					"32877",	
					"32878",	
					"32885",	
					"32886",	
					"32887",	
					"32890",	
					"32891",	
					"32893",	
					"32896",	
					"32897",	
					"32898",	
					"34734",	
					"34740",	
					"34760",	
					"34761",	
					"34777",	
					"34778",
					"34786",	
					"34787");
			List<String> Osceola= Arrays.asList("33848","34739","34741","34742","34743","34744","34745","34747","34758","34769","34770","34771","34772","34773");
			List<String> PalmBeach= Arrays.asList("33401",	
					"33402",	
					"33403",	
					"33404",	
					"33405",	
					"33406",	
					"33407",	
					"33408",	
					"33409",	
					"33410",	
					"33411", 
					"33412",	
					"33413",	
					"33414",	
					"33415",	
					"33416",	
					"33417",	
					"33418",	
					"33419",	
					"33420",	
					"33421",	
					"33422",	
					"33424",	
					"33425",	
					"33426",	
					"33427",	
					"33428",	
					"33429",	
					"33430",	
					"33431",	
					"33432",	
					"33433",	
					"33434",	
					"33435",	
					"33436",	
					"33437",	
					"33438",	
					"33439",	
					"33444",	
					"33445",	
					"33446",	
					"33447",	
					"33448",	
					"33454",	
					"33458",	
					"33459",	
					"33460",	
					"33461",	
					"33462",	
					"33463",	
					"33464",	
					"33465",	
					"33466",	
					"33467",	
					"33468",	
					"33469",	
					"33470",	
					"33474",	
					"33476",	
					"33477",	
					"33478", 
					"33480",	
					"33481",	
					"33482",	
					"33483",	
					"33484",	
					"33486",	
					"33487",	
					"33488",	
					"33493",	
					"33496",	
					"33497",	
					"33498",	
					"33499");
			
			List<String> Pasco= Arrays.asList("33523",	
					"33524",	
					"33525",	
					"33526",	
					"33537",	
					"33539",	
					"33540",	
					"33541",	
					"33542",	
					"33543",	
					"33544",	
					"33574",	
					"33576",	
					"33593",	
					"34610",	
					"34637",	
					"34638",	
					"34639",	
					"34652",	
					"34653",	
					"34654",	
					"34655",	
					"34656",	
					"34667",	
					"34668",	
					"34669",	
					"34673",	
					"34674",	
					"34679",	
					"34680",	
					"34690",	
					"34691",	
					"34692"	);
			List<String> Polk= Arrays.asList("33801",
					"33802",	
					"33803",	
					"33804",	
					"33805",	
					"33806",	
					"33807",	
					"33809",	
					"33810",	
					"33811",	
					"33812",	
					"33813",	
					"33815",	
					"33820",	
					"33823",	
					"33827",	
					"33830",	
					"33831",	
					"33835",	
					"33836",	
					"33837",	
					"33838",	
					"33839",	
					"33840",	
					"33841",	
					"33843",	
					"33844",	
					"33845",	
					"33846",	
					"33847",	
					"33849",	
					"33850",	
					"33851",	
					"33853",	
					"33854",	
					"33855",	
					"33856",	
					"33858",	
					"33860",	
					"33863",	
					"33867",	
					"33868",	
					"33877",	
					"33880",
					"33881",	
					"33882",	
					"33883",	
					"33884",	
					"33885",	
					"33888",	
					"33896",	
					"33897",	
					"33898",	
					"34759"	);
			List<String> Putnam= Arrays.asList("32007",	
					"32112",	
					"32131",	
					"32138",	
					"32139",	
					"32140",	
					"32147",	
					"32148",
					"32149",	
					"32157",	
					"32177",	
					"32178",	
					"32181",	
					"32185",	
					"32187",	
					"32189",	
					"32193",	
					"32666"	);
			List<String> SaintJohns= Arrays.asList("32004",	
					"32033",	
					"32080",	
					"32081",	
					"32082",	
					"32084",	
					"32085",	
					"32086",	
					"32092",	
					"32095",	
					"32145",	
					"32259",	
					"32260");
			List<String> SaintLucie= Arrays.asList("34945",	
					"34946",	
					"34947",	
					"34948",	
					"34949",	
					"34950",	
					"34951",	
					"34952",	
					"34953", 
					"34954",	
					"34979",	
					"34982",	
					"34983",	
					"34984",	
					"34985",	
					"34986",	
					"34987",	
					"34988"	);
			List<String> SantaRosa= Arrays.asList("32530",	
					"32561",	
					"32562",	
					"32563",	
					"32565",
					"32566",	
					"32570",	
					"32571",	
					"32572",
					"32583"	);
			List<String> Sarasota= Arrays.asList("34223",	
					"34229",	
					"34230",	
					"34231",	
					"34232",	
					"34233",	
					"34234",	
					"34235",	
					"34236",	
					"34237",	
					"34238",	
					"34239",	
					"34240",	
					"34241",	
					"34242",	
					"34272",	
					"34274",	
					"34275",	
					"34276",	
					"34277",	
					"34278",	
					"34284",	
					"34285",	
					"34286",	
					"34287",	
					"34288",	
					"34289",	
					"34292",	
					"34293",	
					"34295"	);
			
			List<String> Seminole= Arrays.asList("32701",	
					"32707",	
					"32708",	
					"32714",	
					"32715",	
					"32716",	
					"32718",	
					"32719",	
					"32730",	
					"32732",	
					"32733",	
					"32745",	
					"32746",	
					"32747",	
					"32750",	
					"32752",	
					"32762",	
					"32765",	
					"32766",	
					"32771",	
					"32772",	
					"32773",	
					"32779",	
					"32791",	
					"32795",	
					"32799"	);
			List<String> Sumter= Arrays.asList("32162",	
					"33513",	
					"33514",	
					"33521",	
					"33538",	
					"33585",	
					"33597",	
					"34484",	
					"34785"	);
			List<String> Suwannee= Arrays.asList("32008",	
					"32060",	
					"32062",	
					"32064",	
					"32071",	
					"32094"	);
			List<String> Taylor= Arrays.asList("32347",	
					"32348",	
					"32356",	
					"32357",	
					"32359"	);
			List<String> Union= Arrays.asList("32026","32054","32083","32697");
			List<String> Volusia= Arrays.asList("32105",	
					"32114",	
					"32115",	
					"32116",	
					"32117",	
					"32118",	
					"32119",	
					"32120",
					"32121",	
					"32122",
					"32123",	
					"32124",	
					"32125",	
					"32126",	
					"32127",	
					"32128",	
					"32129",	
					"32130",	
					"32132",	
					"32141",	
					"32168",	
					"32169",	
					"32170",	
					"32173",	
					"32174",	
					"32175",	
					"32176",	
					"32180",	
					"32190",	
					"32198",	
					"32706",	
					"32713",	
					"32720",	
					"32721",	
					"32722",	
					"32723",	
					"32724",	
					"32725",	
					"32728",	
					"32738",	
					"32739",	
					"32744",	
					"32753",	
					"32759",	
					"32763",	
					"32764",	
					"32774"	);
			List<String> Wakulla= Arrays.asList("32336", "32327","32346","32355","32358");
			List<String> Walton= Arrays.asList("32422",	
					"32433",	
					"32434",	
					"32435",	
					"32439",	
					"32454",	
					"32455",	
					"32459",	
					"32461",	
					"32538",	
					"32550"	);
			List<String> Washington= Arrays.asList("32427",	
					"32428",	
					"32437",
					"32462",	
					"32463"	);
			List<String> pinellas= Arrays.asList("33710", "33777", 
					"33744", 
					"33786", 
					"33761", 
					"33763", 
					"33764", 
					"33765", 
					"33767", 
					"33755", 
					"33756", 
					"33759", 
					"34698", 
					"34685", 
					"34688", 
					"33762", 
					"33707", 
					"33785", 
					"33773", 
					"33774", 
					"33760", 
					"33770", 
					"33771", 
					"33778", 
					"33714", 
					"33708", 
					"34677", 
					"34681", 
					"34683", 
					"34684", 
					"33781", 
					"33782", 
					"34695", 
					"33776", 
					"33772", 
					"33706", 
					"33716", 
					"33701", 
					"33702", 
					"33703", 
					"33704", 
					"33705", 
					"33710", 
					"33711", 
					"33712", 
					"33713", 
					"34689", 
					"33715", 
					"33709");
			
			List<String> Hillsboro = Arrays.asList("33572", 
					"33503",
					"33596", 
					"33510", 
					"33511", 
					"33618", 
					"33624", 
					"33558", 
					"33625", 
					"33527", 
					"33614", 
					"33547", 
					"33534", 
					"33556", 
					"33559",
					"33548", 
					"33549", 
					"33619", 
					"33563", 
					"33565", 
					"33566", 
					"33567", 
					"33569", 
					"33578", 
					"33579", 
					"33570", 
					"33584", 
					"33573", 
					"33602", 
					"33603", 
					"33604", 
					"33605", 
					"33606", 
					"33607", 
					"33609", 
					"33610", 
					"33611", 
					"33612", 
					"33620", 
					"33621", 
					"33616", 
					"33629", 
					"33647", 
					"33637", 
					"33617", 
					"33592", 
					"33615", 
					"33634", 
					"33635", 
					"33613", 
					"33594", 
					"33626", 
					"33598");
			
			if(pinellas.contains(data))
			{
				pinellasArea.add(data);
			}
			else if(Alachua.contains(data))
			{
				alachuaArea.add(data);
			}
			else if(Baker.contains(data))
			{
				bakerArea.add(data);
			}
			else if(Bay.contains(data))
			{
				bayArea.add(data);
			}
			else if(Bradford.contains(data))
			{
				bradFordArea.add(data);
			}
			else if(Brevard.contains(data))
			{
				brevardArea.add(data);
			}
			else if(Broward.contains(data))
			{
				browardArea.add(data);
			}
			else if(Calhoun.contains(data))
			{
				calhounArea.add(data);
			}
			else if(Charlotte.contains(data))
			{
				charlotteArea.add(data);
			}
			else if(Citrus.contains(data))
			{
				citrusArea.add(data);
			}
			else if(Clay.contains(data))
			{
				clayArea.add(data);
			}
			else if(Collier.contains(data))
			{
				collierArea.add(data);
			}
			else if(Columbia.contains(data))
			{
				columbiaArea.add(data);
			}
			else if(DeSoto.contains(data))
			{
				deSotoArea.add(data);
			}
			else if(Dixie.contains(data))
			{
				dixieArea.add(data);
			}
			else if(Duval.contains(data))
			{
				duvalArea.add(data);
			}
			else if(Escambia.contains(data))
			{
				escambiaArea.add(data);
			}
			else if(Flagler.contains(data))
			{
				flaglerArea.add(data);
			}
			else if(Franklin.contains(data))
			{
				franklinArea.add(data);
			}
			else if(Gadsden.contains(data))
			{
				gadsdenArea.add(data);
			}
			else if(Gilchrist.contains(data))
			{
				gilchristArea.add(data);
			}
			else if(Glades.contains(data))
			{
				gladesArea.add(data);
			}
			else if(Gulf.contains(data))
			{
				gulfArea.add(data);
			}
			else if(Hamilton.contains(data))
			{
				hamiltonArea.add(data);
			}
			else if(Hardee.contains(data))
			{
				hardeeArea.add(data);
			}
			else if(Hendry.contains(data))
			{
				hendryArea.add(data);
			}
			else if(Hernando.contains(data))
			{
				hernandoArea.add(data);
			}
			else if(Highlands.contains(data))
			{
				highlandsArea.add(data);
			}
			else if(Holmes.contains(data))
			{
				holmesArea.add(data);
			}
			else if(IndianRiver.contains(data))
			{
				indianRiverArea.add(data);
			}
			else if(Jackson.contains(data))
			{
				jacksonArea.add(data);
			}
			else if(Jefferson.contains(data))
			{
				jeffersonArea.add(data);
			}
			else if(Lafayette.contains(data))
			{
				lafayetteArea.add(data);
			}
			else if(Lake.contains(data))
			{
				lakeArea.add(data);
			}
			else if(Lee.contains(data))
			{
				leeArea.add(data);
			}
			else if(Leon.contains(data))
			{
				leonArea.add(data);
			}
			else if(Levy.contains(data))
			{
				levyArea.add(data);
			}
			else if(Liberty.contains(data))
			{
				libertyArea.add(data);
			}
			else if(Madison.contains(data))
			{
				madisonArea.add(data);
			}
			else if(Manatee.contains(data))
			{
				manateeArea.add(data);
			}
			else if(Marion.contains(data))
			{
				marionArea.add(data);
			}
			else if(Martin.contains(data))
			{
				martinArea.add(data);
			}
			else if(MiamiDade.contains(data))
			{
				MiamiDadeArea.add(data);
			}
			else if(Monroe.contains(data))
			{
				monroeArea.add(data);
			}
			else if(Nassau.contains(data))
			{
				nassauArea.add(data);
			}
			else if(Okaloosa.contains(data))
			{
				okaloosaArea.add(data);
			}
			else if(Okeechobee.contains(data))
			{
				okeechobeeArea.add(data);
			}
			else if(Orange.contains(data))
			{
				orangeArea.add(data);
			}
			else if(Osceola.contains(data))
			{
				osceolaArea.add(data);
			}
			else if(PalmBeach.contains(data))
			{
				palmBeachArea.add(data);
			}
			else if(Pasco.contains(data))
			{
				pascoArea.add(data);
			}
			else if(Polk.contains(data))
			{
				polkArea.add(data);
			}
			else if(Putnam.contains(data))
			{
				putnamArea.add(data);
			}
			else if(SaintJohns.contains(data))
			{
				saintJohnsArea.add(data);
			}
			else if(SaintLucie.contains(data))
			{
				saintLucieArea.add(data);
			}
			else if(SantaRosa.contains(data))
			{
				santaRosaArea.add(data);
			}
			else if(Sarasota.contains(data))
			{
				sarasotaArea.add(data);
			}
			else if(Seminole.contains(data))
			{
				seminoleArea.add(data);
			}
			else if(Sumter.contains(data))
			{
				sumterArea.add(data);
			}
			else if(Suwannee.contains(data))
			{
				suwanneeArea.add(data);
			}
			else if(Taylor.contains(data))
			{
				taylorArea.add(data);
			}
			else if(Union.contains(data))
			{
				unionArea.add(data);
			}
			else if(Volusia.contains(data))
			{
				volusiaArea.add(data);
			}
			else if(Wakulla.contains(data))
			{
				wakullaArea.add(data);
			}
			else if(Walton.contains(data))
			{
				waltonArea.add(data);
			}
			else if(Washington.contains(data))
			{
				washingtonArea.add(data);
			}
			else if(Hillsboro.contains(data))
			{
				tampaArea.add(data);
			}	
			
			else
			{
				outsideofFlorida.add(data);
			}
			
			
		}
		int pinellasTotal = pinellasArea.size();
		int hillsboroTotal = tampaArea.size();
		int alachuaToal = alachuaArea.size();
		int bakerTotal = bakerArea.size();
		int bayTotal = bayArea.size();
		int bradFordTotal = bradFordArea.size();
		int brevardTotal = brevardArea.size();
		int browardTotal = browardArea.size();
		int calhounTotal = calhounArea.size();
		int charlotteTotal = charlotteArea.size();
		int citrusTotal = citrusArea.size();
		int clayTotal = clayArea.size();
		int collierTotal = collierArea.size();
		int columbiaTotal = columbiaArea.size();
		int deSotoTotal = deSotoArea.size();
		int dixieTotal = dixieArea.size();
		int duvalTotal = duvalArea.size();
		int escambiaTotal = escambiaArea.size();
		int flaglerTotal = flaglerArea.size();
		int franklinTotal = franklinArea.size();
		int gadsdenTotal = gadsdenArea.size();
		int gilchristTotal = gilchristArea.size();
		int gladesTotal = gladesArea.size();
		int gulfTotal = gulfArea.size();
		int hamiltonTotal = hamiltonArea.size();
		int hardeeTotal = hardeeArea.size();
		int hendryTotal = hendryArea.size();
		int hernandoTotal = hernandoArea.size();
		int highlandsTotal = highlandsArea.size();
		int holmesTotal = holmesArea.size();
		int indianRiverTotal = indianRiverArea.size();
		int jacksonTotal = jacksonArea.size();
		int jeffersonTotal = jeffersonArea.size();
		int lafayetteTotal = lafayetteArea.size();
		int lakeTotal = lakeArea.size();
		int leeTotal = leeArea.size();
		int leonTotal =leonArea.size();
		int levyTotal = levyArea.size();
		int libertyTotal = libertyArea.size();
		int madisonTotal = madisonArea.size();
		int manateeTotal = manateeArea.size();
		int marionTotal = marionArea.size();
		int martinTotal = martinArea.size();
		int miamiDadeTotal = MiamiDadeArea.size();
		int monroeTotal = monroeArea.size();
		int nassauTotal = nassauArea.size();
		int okaloosaTotal = okaloosaArea.size();
		int okeechobeeTotal = okeechobeeArea.size();
		int orangeTotal = orangeArea.size();
		int osceolaTotal = osceolaArea.size();
		int palmBeachTotal = palmBeachArea.size();
		int pascoTotal = pascoArea.size();
		int polkTotal = polkArea.size();
		int putnamTotal = putnamArea.size();
		int saintJohnsTotal = saintJohnsArea.size();
		int saintLucieTotal = saintLucieArea.size();
		int santaRosaTotal = santaRosaArea.size();
		int sarasotaTotal = sarasotaArea.size();
		int seminoleTotal = seminoleArea.size();
		int sumterTotal = sumterArea.size();
		int suwanneeTotal = suwanneeArea.size();
		int taylorTotal = taylorArea.size();
		int unionTotal = unionArea.size();
		int volusiaTotal = volusiaArea.size();
		int wakullaTotal = wakullaArea.size();
		int waltonTotal = waltonArea.size();
		int washingtonTotal = washingtonArea.size();
		int outsideFloridaTotal = outsideofFlorida.size();
		int tampaBayTotal = pinellasArea.size() + tampaArea.size();
		int totalPeopleFromFlorida = pinellasTotal + hillsboroTotal + alachuaToal + bakerTotal + bayTotal + bradFordTotal + brevardTotal + browardTotal + calhounTotal + charlotteTotal + citrusTotal + clayTotal + collierTotal + columbiaTotal + deSotoTotal + dixieTotal + duvalTotal + escambiaTotal + flaglerTotal + franklinTotal + gadsdenTotal + gilchristTotal + gladesTotal + gulfTotal + hamiltonTotal + hardeeTotal + hendryTotal + hernandoTotal + highlandsTotal + holmesTotal + indianRiverTotal + jacksonTotal + jeffersonTotal + lafayetteTotal + lakeTotal + leeTotal + leonTotal + levyTotal + libertyTotal + madisonTotal + manateeTotal + marionTotal + martinTotal + miamiDadeTotal + monroeTotal + nassauTotal + okaloosaTotal + okeechobeeTotal + orangeTotal + osceolaTotal + palmBeachTotal + pascoTotal + polkTotal + putnamTotal + saintJohnsTotal + saintLucieTotal + santaRosaTotal + sarasotaTotal + seminoleTotal + sumterTotal + suwanneeTotal + taylorTotal + unionTotal + volusiaTotal + wakullaTotal + waltonTotal + washingtonTotal;
		int outsideTampbaBayTotal = (totalPeopleFromFlorida) - (pinellasArea.size()) - (tampaArea.size()); 
		System.out.println("Alachua County: " + alachuaToal + "\n" + "Baker County: " + bakerTotal + "\n" + "Bay County: " + bayTotal  + "\n"+ "Bradford County: "  +bradFordTotal + "\n"  + "Brevard County: " + brevardTotal + "\n" + "Broward County: " + browardTotal + "\n" + "Calhoun County: "  + calhounTotal + "\n" + "Charlotte County: " + charlotteTotal + "\n" + "Citrus County: " + citrusTotal + "\n" + "Clay County: " + clayTotal + "\n" + "Collier County: " + collierTotal + "\n" + "Columbia County: "  + columbiaTotal + "\n" + "DeSoto County: " + deSotoTotal + "\n" + "Dixie County: " + dixieTotal + "\n" + "Duval County: " + duvalTotal + "\n" + "Escambia County: " + escambiaTotal + "\n" + "Flagler County: "  + flaglerTotal + "\n" + "Franklin County: " + franklinTotal + "\n" + "Gadsden County: " + gadsdenTotal + "\n" + "Gilchrist County: " + gilchristTotal + "\n" + "Glades County: " + gladesTotal + "\n" + "Gulf County: "  + gulfTotal  + "\n" + "Hamilton County: " + hamiltonTotal + "\n" + "Hardee County: " + hardeeTotal + "\n" + "Hendry County: " + hendryTotal + "\n" + "Hernando County: " + hernandoTotal + "\n" + "Highlands County: " + highlandsTotal + "\n" + "Hillsboro County: " + hillsboroTotal + "\n" + "Holmes County: " + holmesTotal + "\n" + "Indian River County: " + indianRiverTotal + "\n" + "Jackson County: " + jacksonTotal + "\n" + "Jefferson County: " + jeffersonTotal + "\n" + "Lafayette County: " + lafayetteTotal + "\n"  +"Lake County: " + lakeTotal + "\n" + "Lee County: " + leeTotal + "\n" + "Leon County: " + leonTotal + "\n" + "Levy County: " + levyTotal + "\n" + "Liberty County: " + libertyTotal + "\n" + "Madison County: " + madisonTotal + "\n" + "Manatee County: " + manateeTotal + "\n" + "Marion County: " + marionTotal + "\n" + "Martin County: " + martinTotal + "\n" + "Miami-Dade County: " + miamiDadeTotal + "\n" + "Monroe County: " + monroeTotal +"\n" + "Nassau County: " + nassauTotal + "\n" + "Okaloosa County: " + okaloosaTotal + "\n" + "Okeechobee County: "  + okeechobeeTotal + "\n" + "Orange County: " + orangeTotal +"\n" + "Osceola County: " + osceolaTotal + "\n" + "Palm Beach County: " + palmBeachTotal + "\n" + "Pasco County: " + pascoTotal + "\n" + "Pinellas County: " + pinellasTotal + "\n" + "Polk County: " + polkTotal + "\n" + "Putnam County: " + putnamTotal + "\n" + "Saint Johns County: " + saintJohnsTotal + "\n" + "Saint Lucie County: " + saintLucieTotal + "\n" + "Santa Rosa  County: " + santaRosaTotal + "\n" + "Sarasota County: " + sarasotaTotal + "\n" + "Seminole County: " + seminoleTotal + "\n" + "Sumter County: " + sumterTotal + "\n" + "Suwannee County: " + suwanneeTotal + "\n" +"Taylor County: " + taylorTotal + "\n" + "Union County: " + unionTotal + "\n" + "Volusia County: " + volusiaTotal + "\n" + "Wakulla County: " + wakullaTotal + "\n" + "Walton County: " + waltonTotal + "\n" + "Washington County: " + washingtonTotal + "\n" + "Tampa Bay: "+ tampaBayTotal +"\n" + "Outside of Tampa Bay: " + outsideTampbaBayTotal +"\n"+ "Outside of Florida: " + outsideFloridaTotal);
	System.out.println("Total Customers From Florida: " + totalPeopleFromFlorida);	
		scanner.close();
		

	}

}
