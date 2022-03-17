package algorithms.string;

public class CountingWordsWithaGivenPrefix {

    public static void main(String[] args) {
        String[] words = new String[]{"oub","rrjxxacsstfpccffprybnxvpmkssexgfhaxknuyzdfrpzsoyohkmggaukhpnyzmqjbzkqkctlrbnzrfxmfinf","rrrndppiqofqacmkozxdlssekuaajpmtydjlw","ddtvuojkktdfhcfmktkpkuhryoeyrhkewqgskkirixccqjymkxvfbkwafrrobtmslfsegzbzt","oirlqqlfydoucxytmksafgbuyjqs","rrxpajoyi","ddwntyyrmmrmkdokfqlowklzcnemrybxukwzbmeuchfoaiibrujgazlfdj","rarpptobyjqgjdrwxphggtilqhypnlvpwhixda","rrpfqbeyba","brxjhidpqsthlaatrpydqfprozesyxqkdfjrmqe","xzvlcbgmxephipjtgtfzxdhqacpztojejhofexubwtxjwjcjsfqgklpgzuyzmxqfjkgzwdvk","gjzcarsxfpdaeicyhwumogbogwnkrkerocpuasrjnlvhuavnshkajyotqypxjoyghljjfrlcnifikymjhueexzciykfltvmh","h","pxkhkbxfspqbxfrrkbjiygbkdhxasunvtxytfpktgoeqtwvwfbqnpidabmbpsdceflgihohvjfclbxda","xqumplvhsayxpzghfmktmzmbdowelhkxlydjgxrtctsxglggklpchmfxkjxwlwwzkpqbyt","uofvaqzhaecwtyponqkvpolpncorpwwl","rriomxjoasrhtseqhcobzvmohxoucmfaozzmdzqiscjackvtcekdfsoucfkzicmibjwpvfunc","jfqqwiozdpjinfpzpmhhjhqvb","kmdwejqmxmckucwscrcnjxmctjvxvgksjssgwghbmqurzxarlds","cjwweeqmwjtbysduttahhrsgwdbwbcfnqkxaaczqigkwqhklzefevrasifkrq","fnbsqafjrbobjppevxjdfzwblqichhiynjlwsacllclmsncehflbzruwptiksrrhoxiggwx","igkezqdshykrkqdllltuzojjdmedrjwwdgxarjlitjzjrcnplgymudgjmuxdxdgnewwuizvleuuspuvyrufmb","auqpjfvdultntwgrpjiaigdxrigciglwkefbkodbnbffwitneskwpdiodajleo","fllczlseyhztxonifnbfzdihrxqflxhlyice","rrciegtghegenmdsrhbgrnuzamwumpzmvmdtnbrythdrwsrgmegnlpxwlqkzjdwerw","tqlwcmxvuyvrzsfrdfzuyuqqfotekcbxlhqrpcqrdwmitctrusbj","boqgvvdhcgicybijuoynekfnqhirlepioumzauckvgkjvomtmaio","bporansjqnoakgioyfigcpsmsuudiftcmhziwahssdddioi","cdhsvaykxlbmvlnmqtuczxaslvyprjqzyvxxsjbpl","sq","hryymsczwmifyjcmjuffmtadujjphrtwcpvewttifcozdmwalajzjpl","wjzwzzjudvpxdrinflsctgqwbmqevylnutqocaxxuixnbyxdyynrxeieqkkrehbu","qjargkftlfffclyufpuccftlwdufwvlkrtzfbskkcoarhjjwwynuxfmrrwylztheonzqugzord","dgsmitxcillfumdrtozlbbwkbtxskvmlnudxqijxqwofbdqfg","enzojjdyeuszzhpbdta","cygawbbmrgmmtrlhe","evpcnb","vdziajiwijftmxlkssakzs","horvhouechdwjsgbctwbhfgeczyiunzuwrzlmdnwxzlyycxighohqgfrtazisvlm","rrqyldfbhzjqauhlxvbkehirgnpjurvabucqsjtphsyawlkkdfh","bmtxdwmwt","rvcrsrjdukwbcyosnhvnam","rrsrtyhjaakuudvmyofnwgcuaxhmifixkzemopvbikqjzyipgurmjssewjyevomp","oylvoiwzyfhehtyxnetjxmrzksxpzxbwmpukblcjqqwyhxhmndgbxaarnscvvmfy","rrqafzp","ltldjxucbidjlaaweudlkwtvtspxpvakjqmgwaspugxbssecuqtyebvabfapvsnfaulfrgussqirclgjxzbyg","lauhhwzwqausfvm","wmyjhecfdazrpotqfjxlfdimeqddbkrlhkkwhrkjqmjytgrxwsibztteuoqbbqldkk","rrnvvntovbahvtitsrfllbuqjhmblgseqxn","f","zccdzdnwsejylkndwpwnyaevzbxlyacxvhrddhcraegkwvauzhnpadgnrmjsotmagrrwfn","cvsazvqcazlxumnqfpstupfacuyzusobvbaldiluwnwfbbagprrq","rrytquf","lcjibeouquxudfzttfkysbttqjrguljwjqliok","nxvvhisqgnxjnwivktmvvfdgdvokrszlpowpruhcsoklmtljbhrpobpqgmalujew","rrrfmdxuaktqudjdiagdcilwtpkihyvqrcrheuhrfvflydwyloo","rrnj","fohqorjevrumfsdmqmamksifuozzdeagjsapxilcwxhfqxomxaqswsvpyavvacyezpvckcyqajarongtolmlsjuapcra","rlutjuobxxpbqqei","puuljbgtmoybrkgo","ud","fq","lrhauhhgaqrguotyrglghymtkchtsq","nrdxkhitfdwdnscalhjienjtkhhgnpievadfowlufmq","eiacimxegnw","oqsezvgluojxplsnqupfwp","oltulwbiqhzdqpwiznalmtsjejuacnbcwfuzllpvmrywyfailpurdhhltryqanosoeizmlzqifvuzn","ntzrttbsxqvqcyskslbmaipgu","rrhsmeudtsqfthzewvqwdzzwinnyzawzqzhqrgzuluylzqfzgbmtsntrdntdq","uijefbhzqpjoxtalvajzlvhvqyjbntmsfqwrxdofjtdeueilertmndewkjtrckoavbxbmerqomeshmhlstbfxxyfhdfmuim","trdgwdtredlqknfhjsptjnducbnqvexpsggsoyzmtnbvskdg","rrkjtimutbipmywedsjypreojmapfishusnqatvdxotcp","remkvhxnjlwfpbffhkprscpcjzysclsgkdyjczftgpsnouqupwytjpwrrqdyztkwxzxaicwqkrmziyrzpstctbmchqxr","obeprwdggrcaxdnjxduyub","gb","pymvzbtrsdemkgieexpspjawqurgryovkwzlkmxieqeyayzoqtnuymequmuhezs","mljwawotlombcnnrhqzmhopzdihwoffligzhgzjvnyyhiknjxenhmybqqxztrqkbsuhduxovehtromrdwo","sprvuironbfhxxupprpxnhkosefvmqjnitmeemsucayxiiuibgrhbskivncdmoaeroavgevccabq","rrjdsnkrmhekdl","vwizphfkvexzyccuwbifgyymopzivb","vxzperdrldh","vstfeimpakrujoqliwrszwmrzfyodmnekaakvuitppifzsrgelacgfontzozzsshkngdlipjksxmgumyblbbhkqj","oekuyywvojkvpxijgpzrhstfaat","qkzqubsmitlpydfnzbnapvkblacdtehvpfkeitkamhhcgxtjcrm","uargexkdiaauyteiokuhmoaowkexeakutfikicgsieojnhbboxbahkpyyguraiklvtd","ybvkxohogztqivvxppwswewixwuosxmgcfjrxfyias","ifraoutthwyrbhyecxmivxnzku","rrkekeoeyovksnpwnprvdqbmcexdqdubquedbwvqqdlmhyybhq","apejiixlvdgagh","anzktmvearllyviotkvfvbyqgcuptbnf","cumehawcuixhavitrjsjdeon","jtmbuoozakfwcbeyvddfegiskacrsencnmlowjnrhbvklydbgplv","rrnkiqmotaohieyomxhwopllqltuepjymudruhzsirhndvxrzwwcntbudqahougikllviiumatvnopqjrufnwdklq","phwezoocakorvkevbhcicsfwnliprbshdudbyanjiqiy","ezrjymxzpddeoczeiehparadajbxaihqujcberquhyjvzbzhxodynpxlkenoyxejndyuacybxrfkgsgkxjinywrpkk","dvqetqpvjiizcsidkwpjcfqgttmzewzhiplqxqvxnxdnyjuxbabniagrcrcwzuenzxnbhnkhtzjoxbolkupahehqvddnzgubeo","gmlzvqdcyewirndbtitgczptapgpvvtqskfboexkxhnnxjpbjxzbiowkqtztlvuqqdrhittfdcghyxjg","vdyymztrbdfqgomvcztzpsuxwuuiujahfmatlookusicsgnlguhctdeh"};
        System.out.println(prefixCount(words, "rr"));
    }

    public static int prefixCount(String[] words, String pref) {
        int mainCount = 0;
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < pref.length(); j++) {
                if (words[i].length() >= pref.length() && pref.charAt(j) == words[i].charAt(j)) {
                    count++;
                } else {
                    break;
                }

                if (count == pref.length()) {
                    mainCount++;
                }
            }
        }
        return mainCount;
    }
}
