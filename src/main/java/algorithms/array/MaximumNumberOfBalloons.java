package algorithms.array;

import java.util.*;

public class MaximumNumberOfBalloons {

    public static void main(String[] args) {
//        System.out.println(maxNumberOfBalloons("nlaebolko"));
//        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
        System.out.println(maxNumberOfBalloons("leetcode"));
//        System.out.println(maxNumberOfBalloons("rrnlnfevwkvhqzathacmhyhonsvcwmmmehcgchzfjvfoxbnagtxwnwcjcbmbgexqhlefjyrijwjolebtodxtapgyrzmgqzexvugtermrktyjbaicmskxmdopmtoxayydqjjogxmmmpvfiajknjfsikgrwsejzgnbsblsjkkcbaunqthiaetvxlylylzjqkvgysxfoltcmxwrtwpkvhofoaxdugfnsuhepfxudwllyiyrszrpwkwlvpsspvgcimcrngfllsjjdppihhczogfwegibuzzacojtruvozbqwikgdjeqxyarjwaawzictwpdruufifgbqzatmkkdnjajnklnzfdxcsjpmebjqpuqqamoexnnqxccngljzhnhbroyoaphgmksefhizibzpgehvtujmjdhskvpqicxbziqifjqqkaowileochjqhrccajnthqeqgwazedgehdtkwchxjjzcyjimrkykcvkfbzqiusgkxdilnfislphmeliqspvhuichuusqxnutiyxvdtgfnnrrkjwjmkjqjradnocssmfefgfgtzpbnlzxardrrrttnnqttnsowwrqswyqxhsxtlnfxogulwqhkowniohtznlyfjqlzvowcvqxynjpiyiggnxgtmyhjcbehxxsgltojszqyfpnsiybksmozwsqfxpvgeyoyeccxqlcziikavapxyjcftxhfimabmquzkyxnnablhpikwbwwmpjdtmukmuvcfkraqcbopufsaigskwgpjdubbympilgaojuvzgapairttwzuexbsigzcgerblgdgfwkiiqvokbmbtdzkakkeahkgjuyepvtbwqgerztvgunzhgitwottmejilmwyzwczjoxckyjtcbfsryofffaugsketifypahgqgmeypsyjvftqynbzhrobiwouuykyczskcdedidptykluykypnsfuudqgpqzwextbbumiuymngczkfrowkzxxtggqlwlaohfkgfmbyyaboapwhhopewnchlmvifpdkeovpjyugautultdbbxkjxqbcamrpqhndfeybwoatrjwvroakmqapknzzumapytdsdhhlstojlnlvpqjxlpbwfkdupgxzajyjrutzeljnmyxkcdrcjsxfmbqhzblnlqgsqzqjtiaelfkuoyjcjdlpvajkkgyuabgiwlybwmaqdtireukwieifvpzptnebjtwcvmhltkotrvkxcbbsehkdkiegzzbtszfdslqnecluxilqqgqwotfqqoogzzsyfdaujymrjfeoiqpzdeispqsnvlocqdyjcthtxlerjgowzfwsqgourkdhyfaaexjwnfppvrwhdbtsxqqqlrzvkergkxiqzlwdfomyreafirkaycmvjmwnnaqexoewwymvgsrajurzfiohzsbrehhnfghanczevwavsjjslwmnljlmixepwiwalqatgwfzzqhqvrrrhxleuzffgjuihnlbeukyapalwlfjtpumiexkwnvdxiikfajsbxcaywwjjqmgtzrihaoebjduvsmyfvjcthmbjjcausloupnqwjcncosrinvnspqwzlsrivpbpmgsoevunzthofjxspcgordbpudedcfdbbqvymtwujzdtcvigwuofoowqusrsavwkoyabsvllwpqidbpelffmrzfwdhaypxzwofssgkcqobnuomcejbuolmashglsiixcogolmgcmtauauhupkcqdhwesdmpnelcpvnyipakzlsbrpjppayzsremllqnmizvqcphkyuvwrqphdmgiwousanjuazlocddvgduoqmvfovidicmjufaytymcvoonvndbuuljgdvalsnypemzbwovgclcdfwcjptsbelifrqocsuwiwsyzrcxwuweiehtiegogvawkjogwtftbwabpcufuepabxxiqngntudhhuxrvhmhunepamdtfavtuajmrfvgirquwginxtjcmxgmstmhkqncpkdicemhcofqcbceiukstmjzsavwuhgpwbsymupyldwtsbvdjdevvgtddvqqcibnbseqgiaputwgapmovminivrbzlerjwsiofgiihyooqyjchcctvjfebhpvwncqhbleluycybaqlxikorlkqxwzmtrbgpwiqqormjftiarumgxeasqeusnewjqedzhiibbfurgbuwmxfycaevtijtttcbzvgumgiimwzjzpwhuqqwotjrlayrqwcwltiivumafhucrnzjqddvvtrxjsupfxlrohxmytridseyiajntpjsdrbdhdrtnackpytfuzkeiwgukwhvtvehvrdldfugtlwksywnuygichqnjbsmsupsowajduoukduoulagskxvxskewsyhsgakjyqeconciayfwqwdwdnilmllyuwqmatjzxyuhvujrcwkdybdmszzoxwzxojimlfqldxaiqgvziifuobnhonlafoulxgcorcclsxkrwrxinsadpgfmunwjdwgsiepbclggbqpxfjdxqseqidtgrqkixxwmblwokkupjqavvniwjyfuobcbhqfymrayevkteoaturjyvpbjaawgesxnwdvshiiijylclbqwjavftdmrrdsyhqcjweptywnqpcnzucqnzyyptaosrhvfzdomojkoeyepbpbfupkrnyzftjwpdgfqmwhjnhatsedirwzcpeppusaekjsbevlrzyxqtfgcnpszwxhgaeincudnfmcqawcnfkawjrguhitkqtxcxcvojgudfsrezcpfcntnezvskggzhisksxsehgzqxrrqtdlhjhgrblgnbfulmfawtfwnsrjixrjbwwxkvppjdtydgrsnmcpwcudxoiunilylpivbicvxwijrcxhflkznmskrbnighehsyrrzxazwyyvxgffmheubmogkdqtbeyoffgpuathllbiublcvkhzhogbspoogzobbbkylptbwxrbnbhevugkufrbrsgijcvylqeoucsomarwklmmztirevahocqoewrxojvfrakuevheeioirhgttufsxwfymwgxebtazonolntbhfwwgpmoluhnnzcwfhjoxthbuihecsxlfnexaghbaiawxfcsrznockvfoaemmizfltiebkoygchtspwcmijtjvrzljaovsbprmcsgwkqpvjtucemnpxxzzhpxvydfxsoyypecppdwwusbrgysxdaccafafoslqfcohtlgqcuojqwilxbsxrogyfcsqbxdqvdvpnjdeqmrcriczwviehftrhuwrguzrhukemyzeeworelrjwosskahsiazkpwvgscbihgnqtcoicapcsbvngvqgkqgvfuyhcoabpgrdqthxbalglvvrxifdzocgnweutsgrhmiuhoitrmccscophlcmarepzlisqdzidhocliidjikgzsmbjasukprfvlpkgryoyjtmuknjcmphkzhipocykitztqihhsjmxbrwefwgbdkdillzkosondaevcfyeikdfhgnughasibklabfwxkpxjpfwbjlczyusecvbyzlnxbhodtqpacvdgzzffxegivtemuswsmgiieldivzbildwucddnizmyofqtymmikpkzwohivqnipnwrdjatiyvlnrtwkrcrifmxvofolrbbhvyigrlsldqgbivahebsttymezbixrheczduzsqidjxfqorcxqssmcpnphnprpwlkyofnamfmezxoivrtxoxqralelxegltcpsleogdotrdgwxaspyghklhklbxsvfwjkbdjikdtzyhoufeqnqcmetpvvilyakjxmsoescrvivbslvdpunwhuylsgswgvfxfptnrskmsyiezttvwjwilhqdnpvayggvwepizpmjwhsellrypgtujbmqmpnngkwkgwrasmnomqhukusjadlpgpbhpnefhjippzhcdasuhauthuqbvvmndggmlckpjuuopsyrwtwkdtkwplrgfrgunfogevjqxqsoryjwmahmqhlgbyfqfgcfanjkerbirdilapihcrquviryewnphzwhsprelcnlgsczxonivmzknffspyeodsyxtkjcnljwfldvqwqndjcpxzxhjnsjuoedkrbmcsyyfhhjbvekmnfpxwchganhcmxbtoaofbbfvfewpzqrpgindhcqutdkyrtufdnsxxhachxvvfokczlrcdvygxusslaxllcspnbrtblgjlzmkxfpgeuepetuzesccdskwfunxaehfxsqopqjplukuivautozxtlujwxoijihzueabboyxvbtaangqzokdzwhbxodlfmryhikccbdprouslrgktmdjimvwshpbzvdmbtyyggnsamppcasbmdxlbsoosftfmamcmpvaojyfbwajwkodaokljngsknpklkticblmghnihdmezdyvriohgvvonutlmcfavvqndjnsskhamflpipuvusyqyzwlfrlestfppascaszytzagpcrwgeswhzuquurnytvrzsoyuqvjpwbmyksxueizewjmxnncniuddtmkpqhrzonwahjgmjxwihyalelbnwplqqhdgyrhcrnpdslxbdjhlmbvbvkwhjivspoejwtviwujcnuqjkskfpdnefruoyziynqcivjvlvaojhpcncbspuatgsyizklwfdbhwzbrbmxcyfxiwuwsorckrtdazaorauxmecsoywytrhuwqrobxndyfvwqukccpidvmecwuhdnqfsahqoxtswfdzzaystjmikdumrznihaakatobdrmjmahgefjomhywqfuiquafulpybnrvcfptttjaohipdrgbtvdzgxsakfvvoumdlalajlpusskjwlweufcjzpzhdcssqlkkrhaonmzxqtulrpqhubbgbagwyzpizbjegvjtqbkaiqididqvnbsknxegvkcfxdlljqs"));
    }

    public static int maxNumberOfBalloons(String text) {
        List<Character> list = gen(text);
        Map<Character, Integer> map = new HashMap<>();

        for ( Character character : list) {
            if (map.get(character)!=null) {
                int d = map.get(character)+1;
                map.put(character, d);
            } else {
                map.put(character, 1);
            }
        }

        int c = 0;
        for (int i = 0; i < text.length() / 7 ; i++) {

            StringJoiner js = new StringJoiner("");
            Integer countB = map.get('b');
            Integer countA = map.get('a');
            Integer countL = map.get('l');
            Integer countO = map.get('o');
            Integer countN = map.get('n');
            if (countB!=null && countA!=null &&   countL!=null && countO!=null && countN!=null ) {
                if (map.get('b') >= 1) {
                    map.put('b',countB -1 );
                    js.add("b");
                }

                if (map.get('a') >=1) {
                    map.put('a',countA -1 );
                    js.add("a");
                }

                if (map.get('l') >= 2) {
                    map.put('l',countL -2 );
                    js.add("ll");
                }

                if (map.get('o') >= 2) {
                    map.put('o',countO -2 );
                    js.add("oo");
                }

                if (map.get('n') >= 1) {
                    map.put('n',countN -1 );
                    js.add("n");
                }


                if (js.toString().equals("balloon")) {
                    c++;
                }
            }

        }


        return c;

    }




    static  List<Character>  gen(String text){
       List<Character> textList = new LinkedList<>();
        for (int i = 0; i < text.length(); i++) {
            textList.add(text.charAt(i));
        }
        return textList;
    }
}
