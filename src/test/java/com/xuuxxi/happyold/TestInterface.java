package com.xuuxxi.happyold;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: Xuuxxi
 * @Date: 2022/10/23
 */
public class TestInterface {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("阿城市", "341", "阿勒泰市", "132", "阿图什市", "400", "安吉县", "437", "安宁市", "372", "安庆市", "337", "安顺市", "345", "安阳市", "76", "鞍山市", "112", "巴彦淖尔市", "271", "巴中市", "331", "白山市", "343", "白银市", "386", "蚌埠市", "427", "包头市", "108", "宝泉岭", "285", "保定市", "110", "北海市", "315", "北京市", "73", "毕节市", "352", "滨海新区", "486", "滨州市", "148", "亳州市", "264", "博乐市", "346", "沧州市", "119", "长春市", "105", "长沙市", "107", "长治市", "124", "常德市", "498", "常州市", "102", "朝阳区", "476", "潮州市", "138", "郴州市", "272", "成都市", "55", "承德市", "278", "澄城县", "499", "赤壁市", "385", "赤峰市", "270", "滁州市", "310", "楚雄市", "338", "淳安县", "418", "达州市", "361", "大理白族自治州", "472", "大连市", "104", "大庆市", "409", "大同市", "246", "大冶市", "473", "丹东市", "478", "当涂县", "417", "道孚县", "403", "德清县", "463", "德阳市", "159", "德州市", "149", "调兵山市", "221", "定西市", "442", "东海", "298", "东莞市", "56", "东乌珠穆沁旗", "480", "东兴市", "305", "东营市", "146", "都江堰市", "319", "都匀市", "416", "独山子区", "490", "敦煌市", "423", "多伦县", "467", "额敏市", "364", "鄂尔多斯市", "367", "恩施土家族苗族自治州", "406", "繁峙县", "470", "汾西县", "393", "奉化市", "326", "佛山市", "65", "福清市", "432", "福州市", "92", "抚顺市", "222", "抚州市", "450", "阜宁县", "487", "阜阳市", "263", "甘泉县", "515", "甘孜市", "350", "赣州市", "84", "高平市", "370", "高邑县", "441", "个旧市", "502", "固安县", "500", "固原市", "232", "广汉市", "286", "广州市", "85", "贵港市", "165", "贵阳市", "120", "桂林市", "392", "桂平市", "289", "哈尔滨市", "126", "哈密市", "477", "海东市", "443", "海口市", "154", "海拉尔区", "445", "海林市", "291", "海宁市", "375", "海盐市", "379", "邯郸市", "71", "杭州市", "53", "合肥市", "411", "河池市", "339", "河津市", "505", "河源市", "325", "菏泽市", "151", "贺州市", "340", "衡水市", "279", "衡阳市", "484", "侯马市", "376", "呼和浩特市", "94", "呼伦贝尔市", "143", "壶关县", "407", "怀化市", "408", "淮安市", "106", "淮北市", "401", "淮南市", "139", "黄骅市", "454", "珲春市", "219", "惠水市", "333", "惠州市", "62", "霍州市", "415", "吉安市", "308", "吉林市", "113", "济南市", "86", "济宁市", "122", "佳木斯市", "359", "嘉兴市", "74", "建水县", "497", "江门市", "158", "江阴市", "469", "江油市", "309", "焦作市", "72", "揭阳市", "405", "金华市", "253", "锦州市", "261", "晋城市", "277", "晋中市", "244", "京山市", "503", "荆门市", "481", "荆州市", "496", "精河县", "117", "景德镇市", "439", "九江市", "304", "开封市", "70", "开原市", "519", "开远市", "301", "科右中旗", "292", "可克达拉市", "504", "克拉玛依市", "351", "昆明市", "118", "拉萨市", "88", "来宾市", "404", "莱芜市", "287", "兰考县", "426", "兰州市", "63", "廊坊市", "276", "乐山市", "255", "丽江市", "141", "辽阳市", "153", "聊城市", "150", "林芝市", "444", "临沧市", "483", "临汾市", "247", "临高县", "412", "临海市", "391", "临沂市", "116", "陵川市", "329", "陵水黎族自治县", "164", "柳州市", "362", "六盘水市", "245", "六枝市", "335", "龙海", "311", "龙南市", "474", "龙岩市", "266", "陇南市", "140", "娄底市", "230", "泸州市", "378", "吕梁市", "248", "罗甸县", "513", "洛阳市", "130", "漯河市", "447", "麻江县", "235", "马鞍山市", "265", "茂名市", "317", "梅州市", "323", "门源回族自治县", "471", "蒙自市", "384", "绵阳市", "157", "绵阳市江油市", "160", "牡丹江市", "156", "牡丹江市海林市", "169", "牡丹江市绥芬河市", "168", "内江市", "155", "那曲市", "510", "南昌市", "68", "南京市", "64", "南宁市", "91", "南平市", "268", "南通市", "99", "南阳市", "75", "讷河市", "306", "宁波市", "90", "宁德市", "274", "宁武市", "369", "农安市", "342", "攀枝花市", "256", "盘锦市", "135", "盘州市", "314", "磐安县", "464", "平顶山市", "238", "平定县", "436", "平湖市", "424", "萍乡市", "381", "莆田市", "95", "濮阳市", "237", "普洱市", "320", "七台河市", "446", "祁县", "296", "祁阳市", "284", "齐齐哈尔市", "307", "奇台县", "87", "启东市", "421", "迁安市", "414", "秦皇岛市", "125", "沁水市", "371", "青岛市", "57", "青州市", "491", "清徐县", "456", "清远市", "228", "琼中市", "348", "曲阜市", "388", "曲靖市", "233", "曲阳县", "398", "衢州市", "254", "泉州市", "103", "仁怀市", "399", "日照市", "142", "荣县市", "318", "如东县", "422", "乳山市", "428", "芮城县", "451", "瑞安市", "61", "三门峡市", "420", "三明市", "267", "三亚市", "114", "沙湾市", "358", "山南市", "448", "汕头市", "380", "汕尾市", "227", "商丘市", "77", "上海市", "80", "韶关市", "303", "邵阳市", "240", "绍兴市", "89", "射阳县", "488", "深圳市", "60", "沈阳市", "81", "嵊州市", "475", "十堰市", "397", "石城县", "495", "石家庄市", "97", "石阡县", "434", "寿阳县", "508", "双河市", "453", "双鸭山市", "419", "朔州市", "249", "四会市", "389", "松原市", "344", "苏尼特右旗", "458", "苏州市", "59", "宿迁市", "299", "宿州市", "431", "绥芬河", "290", "随州市", "482", "塔城市", "365", "台北市", "283", "台州市", "109", "太仓市", "349", "太原市", "66", "泰安市", "123", "泰州市", "167", "唐山市", "100", "滕州市", "288", "天长市", "413", "天津市", "54", "天门市", "328", "天水市", "395", "天镇县", "452", "铁力市", "465", "铁岭市", "163", "通化市", "516", "桐城市", "511", "铜陵市", "273", "图们市", "377", "吐鲁番市", "133", "托里市", "366", "万宁市", "374", "万荣县", "297", "威海市", "137", "威宁市", "357", "涠洲岛", "313", "潍坊市", "147", "温岭市", "387", "温州市", "93", "文山市", "356", "乌拉特前旗", "396", "乌兰浩特市", "507", "乌鲁木齐市", "51", "无锡市", "98", "吴忠市", "231", "梧州市", "236", "武冈市", "433", "武汉市", "281", "西安市", "115", "西丰市", "382", "西平县", "512", "锡林浩特市", "368", "习水县", "506", "厦门市", "82", "仙桃市", "489", "咸宁市", "336", "咸阳市", "461", "香港特别行政区湾仔区", "121", "香格里拉市", "493", "香河县", "468", "湘潭市", "239", "湘西土家族苗族自治州吉首市", "241", "襄阳市", "275", "襄垣县", "438", "忻州市", "250", "新民市", "517", "新乡市", "79", "新沂市", "347", "新余市", "259", "信丰市", "360", "信阳市", "466", "兴安盟突泉县", "171", "兴义市", "355", "邢台市", "429", "岫岩", "294", "岫岩满族自治县", "220", "徐州市", "101", "许昌市", "69", "牙克石市", "330", "雅安市", "258", "烟台市", "96", "盐城市", "435", "兖州市", "383", "扬州市", "394", "阳城", "302", "阳江市", "226", "阳曲县", "462", "阳泉市", "251", "杨陵市", "354", "伊春市", "300", "伊犁哈萨克自治州伊宁市", "269", "伊宁市", "521", "依兰县", "410", "沂源市", "321", "宜宾市", "257", "宜宾市南溪区", "224", "宜宾市屏山县", "166", "宜昌市", "223", "宜春市", "520", "义乌市", "440", "益阳市", "494", "翼城县", "479", "银川市", "129", "鹰潭市", "260", "营口市", "262", "永丰市", "316", "永济市", "459", "永州市冷水滩区", "242", "永州市祁阳县", "128", "玉林市", "455", "玉溪市", "485", "垣曲县", "449", "岳池县", "430", "岳阳市", "111", "云浮市", "229", "运城市", "252", "枣庄市", "145", "扎兰屯市", "293", "湛江市", "225", "张家港市", "324", "张家界市", "243", "张家口市", "83", "章丘区", "457", "漳州市", "162", "招远市", "322", "昭通市", "332", "镇江市", "127", "镇雄市", "390", "镇远市", "334", "郑州市", "58", "中山市", "67", "中卫市", "514", "重庆市", "52", "舟山市", "353", "周口市", "460", "珠海市", "280", "驻马店市", "78", "庄河市", "327", "准格尔旗", "425", "涿鹿市", "373", "资阳市", "312", "淄博市", "136", "自贡市", "402", "邹城市", "501", "遵义市", "234", "左权县", "509"));
        System.out.println(arr.get(arr.indexOf("福州市") + 1));
    }
}

