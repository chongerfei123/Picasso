package com.example.zl.bean;

import java.util.List;

/**
 * Created by zl on 2017/4/26.
 */

public class JsonBean {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"d42995b5d640a9ad83638e98a2d75b4d","title":"6艘载朝鲜煤炭船只在唐山港卸载 外交部：非进口","date":"2017-04-26 18:50","category":"头条","author_name":"外交部网站","url":"http://mini.eastday.com/mobile/170426185048486.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170426/20170426185048_77082e34dd005461e7e2d249b69831eb_3_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170426/20170426185048_77082e34dd005461e7e2d249b69831eb_1_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170426/20170426185048_77082e34dd005461e7e2d249b69831eb_2_mwpm_03200403.jpeg"},{"uniquekey":"1fd1b1116d09c6a667549df46bf66320","title":"云南发现植物中的\u201c熊猫\u201d火焰兰：现存不到十株","date":"2017-04-26 18:08","category":"头条","author_name":"央视新闻","url":"http://mini.eastday.com/mobile/170426180839772.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170426/20170426180839_5ca5a673ccc14fa5053da3dfd94e98fb_1_mwpm_03200403.png"},{"uniquekey":"7bb26362eb20dbab0dec4d370e2a0e0a","title":"看不惯老公脸上4年陈痘，妻用力一挤竟喷发白脓瀑布","date":"2017-04-26 18:00","category":"头条","author_name":"千趣网","url":"http://mini.eastday.com/mobile/170426180007605.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170426/20170426180007_07c8f3b876ae8708ad3119efded75b8d_2_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170426/20170426180007_07c8f3b876ae8708ad3119efded75b8d_1_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170426/20170426180007_45bd7c40375654fd473960f882cfeb61_3_mwpm_03200403.png"},{"uniquekey":"d8524f07e356ed218e4926d829685fd5","title":"女球迷看球嗨过头 竟当场起身脱衣露出豪乳","date":"2017-04-26 17:59","category":"头条","author_name":"千趣网","url":"http://mini.eastday.com/mobile/170426175955977.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170426/20170426175955_8a0345f3a289e5a135a2fc7c05d0bd87_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170426/20170426175955_8a0345f3a289e5a135a2fc7c05d0bd87_2_mwpm_03200403.png"},{"uniquekey":"2f6059c41c90b4a506e65874f6f94846","title":"她自称校花却遭惨骂，丈夫去世拒绝再婚，快60岁终于等到春天","date":"2017-04-26 17:55","category":"头条","author_name":"爱尚悦读","url":"http://mini.eastday.com/mobile/170426175530743.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170426/20170426175530_e83f8e1c65be08e7205e17276ea213ea_21_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170426/20170426175530_e83f8e1c65be08e7205e17276ea213ea_9_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170426/20170426175530_e83f8e1c65be08e7205e17276ea213ea_13_mwpm_03200403.jpeg"},{"uniquekey":"df29eeb9190f2811b2444f7391c27f1c","title":"中纪委再次\u201c秒杀\u201d老虎，安徽副省长周春雨被查！","date":"2017-04-26 17:46","category":"头条","author_name":"海运仓内参","url":"http://mini.eastday.com/mobile/170426174623318.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170426/20170426174623_b47690ce22a37be851ebd62a39a833c5_1_mwpm_03200403.jpeg"},{"uniquekey":"4550463fbb2037e2fd622f3f2867bd78","title":"1975年黑色4月，南越南亡国景象，百万人大逃亡","date":"2017-04-26 17:40","category":"头条","author_name":"越南古与今","url":"http://mini.eastday.com/mobile/170426174040971.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170426/20170426174040_16397ef737c02c0283466512d7b687ab_5_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170426/20170426174040_16397ef737c02c0283466512d7b687ab_8_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170426/20170426174040_16397ef737c02c0283466512d7b687ab_7_mwpm_03200403.jpeg"},{"uniquekey":"2ccc0ac9958c1f038af8a06f782f8da4","title":"夏宝龙离任浙江省委书记时的真情告白","date":"2017-04-26 17:40","category":"头条","author_name":"浙江新闻","url":"http://mini.eastday.com/mobile/170426174029855.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170426/20170426174029_1c799e16dc12271078e34c59d9c72fd7_1_mwpm_03200403.jpeg"},{"uniquekey":"614e44cf403b0614cd6d70f9394f3129","title":"山东、浙江与河北：一日三省领导履新","date":"2017-04-26 17:37","category":"头条","author_name":"海运仓内参","url":"http://mini.eastday.com/mobile/170426173731602.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170426/20170426173731_eef17e39100ec083bb8223f5912d978c_3_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170426/20170426173731_eef17e39100ec083bb8223f5912d978c_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170426/20170426173731_eef17e39100ec083bb8223f5912d978c_4_mwpm_03200403.jpeg"},{"uniquekey":"d86921109b47bf0c6cfd23e5441963b1","title":"警惕！\"免费送\"\"全额返款\"成诱惑陷阱","date":"2017-04-26 17:35","category":"头条","author_name":"国际在线","url":"http://mini.eastday.com/mobile/170426173527840.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170426/20170426173527_1beddcadf9eeaf1ad7dbda47ca352d91_1_mwpm_03200403.jpeg"},{"uniquekey":"99968e63932ec7cc14d57069f65035f0","title":"石泰峰任宁夏自治区党委书记","date":"2017-04-26 17:27","category":"头条","author_name":"新华社","url":"http://mini.eastday.com/mobile/170426172747745.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170426/20170426172747_ea60cfbd9a8d93d2bd3a335f6d710058_1_mwpm_03200403.jpeg"},{"uniquekey":"8070d24beab7d32401a1628ac8ce0ce5","title":"韩国正式部署萨德 星州民众持续抗议 与警方冲突","date":"2017-04-26 17:25","category":"头条","author_name":"国际在线新闻","url":"http://mini.eastday.com/mobile/170426172534568.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170426/20170426172534_bd8564196ee4f1c2882f42dfd94eb8e6_2_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170426/20170426172534_bd8564196ee4f1c2882f42dfd94eb8e6_3_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170426/20170426172534_bd8564196ee4f1c2882f42dfd94eb8e6_1_mwpm_03200403.jpeg"},{"uniquekey":"8709485262670740b6ab82cfb5223ba3","title":"范爷不如她漂亮？18年前大黑牛差点娶了她，如今她儿子叫李晨爸","date":"2017-04-26 17:24","category":"头条","author_name":"街头小木头","url":"http://mini.eastday.com/mobile/170426172458957.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170426/20170426172458_bd934f80b2d01b53e9c0db927cc7e4d7_10_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170426/20170426172458_bd934f80b2d01b53e9c0db927cc7e4d7_6_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170426/20170426172458_bd934f80b2d01b53e9c0db927cc7e4d7_8_mwpm_03200403.jpeg"},{"uniquekey":"dee4a774f72e813303b284626fc6c997","title":"中国第二艘航母下水了，德国海天巨兽\u201c空天航母\u201d可不是设想！","date":"2017-04-26 17:24","category":"头条","author_name":"同族汇APP","url":"http://mini.eastday.com/mobile/170426172440264.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170426/20170426172440_19d8df390a77ef3fff86ca5b62b6fdc4_11_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170426/20170426172440_19d8df390a77ef3fff86ca5b62b6fdc4_9_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170426/20170426172440_19d8df390a77ef3fff86ca5b62b6fdc4_6_mwpm_03200403.jpeg"},{"uniquekey":"2bbbdc76e95c46d34862e26a2879df11","title":"娱乐圈内最干净的四位女星，低调不炒作，第二位连王思聪也不敢惹","date":"2017-04-26 17:24","category":"头条","author_name":"有瘾","url":"http://mini.eastday.com/mobile/170426172434441.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170426/20170426172434_8d00abadf81295ea6d6c8cda86cc4656_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170426/20170426172434_8d00abadf81295ea6d6c8cda86cc4656_7_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170426/20170426172434_8d00abadf81295ea6d6c8cda86cc4656_8_mwpm_03200403.jpeg"},{"uniquekey":"dd9d40510ee7b813127d67f5c4fe7d32","title":"黄晓明终于晒Baby孕照啦 甜美幸福打脸借腹生子传闻","date":"2017-04-26 17:21","category":"头条","author_name":"Yes娱乐网","url":"http://mini.eastday.com/mobile/170426172112138.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170426/20170426172112_f5a14f64ffbb6150a5bfb1ec009d2c9c_2_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170426/20170426172112_f5a14f64ffbb6150a5bfb1ec009d2c9c_1_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170426/20170426172112_f5a14f64ffbb6150a5bfb1ec009d2c9c_3_mwpm_03200403.jpeg"},{"uniquekey":"ad919d8c6b76f00183264c808ded36c3","title":"谢娜现身录快本让人心疼，张杰经纪人一路紧随护周全！","date":"2017-04-26 17:09","category":"头条","author_name":"扒八美少女","url":"http://mini.eastday.com/mobile/170426170904384.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170426/20170426170904_73f7ac9add7169045ffabe81db6504d2_9_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170426/20170426170904_73f7ac9add7169045ffabe81db6504d2_8_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170426/20170426170904_73f7ac9add7169045ffabe81db6504d2_6_mwpm_03200403.jpeg"},{"uniquekey":"62a2f4ea47398bb0da4b1b8c2cf38ff9","title":"安徽省副省长周春雨涉嫌严重违纪接受组织审查","date":"2017-04-26 17:03","category":"头条","author_name":"国际在线","url":"http://mini.eastday.com/mobile/170426170338012.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170426/20170426170338_4d2f4d6e0e3ee4a48036ccea605a9a9c_1_mwpm_03200403.jpeg"},{"uniquekey":"5ee72a6a1b161bb9912ca062d1caead0","title":"农村男子无意把一把米放入油锅中，随后的一幕令人惊奇！","date":"2017-04-26 17:01","category":"头条","author_name":"旅游奇闻","url":"http://mini.eastday.com/mobile/170426170153045.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170426/20170426_901998d428904a5eaf1632a4e18e526b_cover_mwpm_03200403.png","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170426/20170426_5fa21facc5706161f9f3d4242c4cf565_cover_mwpm_03200403.png","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170426/20170426_7271e703b786cc2222651080d34fe740_cover_mwpm_03200403.png"},{"uniquekey":"11742c2d19fbd2bc1dc71cd79e19704d","title":"日本复兴相再度出言不逊引咎辞职 安倍这次并未袒护","date":"2017-04-26 17:01","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170426170140029.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170426/20170426170140_593ac744027d275d14bf0e39498a9aeb_1_mwpm_03200403.jpeg"},{"uniquekey":"ace64e9dfe6e84328c6f1b0c63ae7df1","title":"文在寅就\u201c萨德\u201d部分组件凌晨运入发声明：无视民意","date":"2017-04-26 17:00","category":"头条","author_name":"央视新闻客户端","url":"http://mini.eastday.com/mobile/170426170033151.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170426/20170426170033_f3adccb236ac14bb782101126498aab8_1_mwpm_03200403.jpeg"},{"uniquekey":"ffcf8f7071f06051c1627984577fb270","title":"蔡英文发美对台军售妄言国台办：开历史倒车","date":"2017-04-26 16:54","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/170426165433844.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170426/20170426165433_d8c663df2967ec76331841a4ec3faac1_1_mwpm_03200403.jpeg"},{"uniquekey":"13308d7bff601e7867b7127962e51d20","title":"娶这几个生肖的女人回家 如虎添翼福禄寿三全","date":"2017-04-26 16:54","category":"头条","author_name":"运势北雅","url":"http://mini.eastday.com/mobile/170426165430451.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170426/20170426165430_99ee8faac4cf04cd3f840c427c20e14e_2_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170426/20170426165430_99ee8faac4cf04cd3f840c427c20e14e_3_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170426/20170426165430_99ee8faac4cf04cd3f840c427c20e14e_1_mwpm_03200403.jpeg"},{"uniquekey":"1c2e9c2db02bb49c06f5d0e0daf8e85e","title":"今天，中国军队干了件大事！雄起，中国海军！ ","date":"2017-04-26 16:52","category":"头条","author_name":"东方号","url":"http://mini.eastday.com/mobile/170426165246183.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170426/20170426165246_730a563b4b31096168ac7dbd6657cd12_3_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170426/20170426165246_730a563b4b31096168ac7dbd6657cd12_12_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170426/20170426165246_730a563b4b31096168ac7dbd6657cd12_2_mwpm_03200403.jpeg"},{"uniquekey":"7196f99f5f9e4a1d6a68bc167c50b113","title":"为什么那么多女人甘愿出卖自己？原来她们都来自这里！","date":"2017-04-26 16:48","category":"头条","author_name":"智娱智乐","url":"http://mini.eastday.com/mobile/170426164836871.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170426/20170426_fe5c0dfbfdc236958e44fbe401712115_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170426/20170426_891648ccded02bdc534941951e9ecdc9_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170426/20170426_2bd4f94d73cbb377b9df6246401eba86_cover_mwpm_03200403.jpeg"},{"uniquekey":"09d3930cea34a2157d2f047f252bc3b1","title":"俄外长：强硬手段解决朝鲜问题将会带来灾难性后果","date":"2017-04-26 16:44","category":"头条","author_name":"央视新闻客户端","url":"http://mini.eastday.com/mobile/170426164438299.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170426/20170426164438_841e1235f8051878b9d3b0f31420f655_1_mwpm_03200403.png"},{"uniquekey":"5286be6abb074e24753e89de0002bb26","title":"谢娜删掉有关张杰的恩爱微博，何炅用这句话还原真相打脸卓伟","date":"2017-04-26 16:44","category":"头条","author_name":"前创工作室","url":"http://mini.eastday.com/mobile/170426164416141.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170426/20170426_2770748e614bd972aae93b0890e48d05_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170426/20170426_a97b43f6ac917517ade49176d1ee09ba_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170426/20170426_985576d79f00cbbbdd5be53652cde97e_cover_mwpm_03200403.jpeg"},{"uniquekey":"c9b0da29a2de63b60057349269d0db87","title":"英拉下台：中国\u201c见死不救\u201d的真正原因曝光！","date":"2017-04-26 16:40","category":"头条","author_name":"三军军事","url":"http://mini.eastday.com/mobile/170426164015080.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170426/20170426_968dc48fc1c7ccb33e1f08ebd74fc4f4_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170426/20170426_0c9846b13eec6a53db1d74a0bf9e5456_cover_mwpm_03200403.png"},{"uniquekey":"206cf3e83110588181999147b6317b15","title":"\u201c党建+互联网\u201d 上海勇为先行者","date":"2017-04-26 16:31","category":"头条","author_name":"人民网-上海频道","url":"http://mini.eastday.com/mobile/170426163119027.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170426/20170426163119_beaafbdc3b2e58dc9dba1f3ffea326aa_3_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170426/20170426163119_beaafbdc3b2e58dc9dba1f3ffea326aa_4_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170426/20170426163119_beaafbdc3b2e58dc9dba1f3ffea326aa_6_mwpm_03200403.jpeg"},{"uniquekey":"89c4254583cfb270ffc60f14417c186a","title":"各国女兵的辣眼睛方式，只觉得中国最美，还有一张亮点十足","date":"2017-04-26 16:29","category":"头条","author_name":"全球未解真相国际","url":"http://mini.eastday.com/mobile/170426162920444.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170426/20170426_e45738d1e21af17af8934229094984d8_mwpm_03200403.png","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170426/20170426_9d8668f1ac66c40d87a4427faa737051_mwpm_03200403.png","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170426/20170426_14c6b2528015c4ae7e1d0513c718e107_mwpm_03200403.png"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"d42995b5d640a9ad83638e98a2d75b4d","title":"6艘载朝鲜煤炭船只在唐山港卸载 外交部：非进口","date":"2017-04-26 18:50","category":"头条","author_name":"外交部网站","url":"http://mini.eastday.com/mobile/170426185048486.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170426/20170426185048_77082e34dd005461e7e2d249b69831eb_3_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170426/20170426185048_77082e34dd005461e7e2d249b69831eb_1_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170426/20170426185048_77082e34dd005461e7e2d249b69831eb_2_mwpm_03200403.jpeg"},{"uniquekey":"1fd1b1116d09c6a667549df46bf66320","title":"云南发现植物中的\u201c熊猫\u201d火焰兰：现存不到十株","date":"2017-04-26 18:08","category":"头条","author_name":"央视新闻","url":"http://mini.eastday.com/mobile/170426180839772.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170426/20170426180839_5ca5a673ccc14fa5053da3dfd94e98fb_1_mwpm_03200403.png"},{"uniquekey":"7bb26362eb20dbab0dec4d370e2a0e0a","title":"看不惯老公脸上4年陈痘，妻用力一挤竟喷发白脓瀑布","date":"2017-04-26 18:00","category":"头条","author_name":"千趣网","url":"http://mini.eastday.com/mobile/170426180007605.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170426/20170426180007_07c8f3b876ae8708ad3119efded75b8d_2_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170426/20170426180007_07c8f3b876ae8708ad3119efded75b8d_1_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170426/20170426180007_45bd7c40375654fd473960f882cfeb61_3_mwpm_03200403.png"},{"uniquekey":"d8524f07e356ed218e4926d829685fd5","title":"女球迷看球嗨过头 竟当场起身脱衣露出豪乳","date":"2017-04-26 17:59","category":"头条","author_name":"千趣网","url":"http://mini.eastday.com/mobile/170426175955977.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170426/20170426175955_8a0345f3a289e5a135a2fc7c05d0bd87_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170426/20170426175955_8a0345f3a289e5a135a2fc7c05d0bd87_2_mwpm_03200403.png"},{"uniquekey":"2f6059c41c90b4a506e65874f6f94846","title":"她自称校花却遭惨骂，丈夫去世拒绝再婚，快60岁终于等到春天","date":"2017-04-26 17:55","category":"头条","author_name":"爱尚悦读","url":"http://mini.eastday.com/mobile/170426175530743.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170426/20170426175530_e83f8e1c65be08e7205e17276ea213ea_21_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170426/20170426175530_e83f8e1c65be08e7205e17276ea213ea_9_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170426/20170426175530_e83f8e1c65be08e7205e17276ea213ea_13_mwpm_03200403.jpeg"},{"uniquekey":"df29eeb9190f2811b2444f7391c27f1c","title":"中纪委再次\u201c秒杀\u201d老虎，安徽副省长周春雨被查！","date":"2017-04-26 17:46","category":"头条","author_name":"海运仓内参","url":"http://mini.eastday.com/mobile/170426174623318.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170426/20170426174623_b47690ce22a37be851ebd62a39a833c5_1_mwpm_03200403.jpeg"},{"uniquekey":"4550463fbb2037e2fd622f3f2867bd78","title":"1975年黑色4月，南越南亡国景象，百万人大逃亡","date":"2017-04-26 17:40","category":"头条","author_name":"越南古与今","url":"http://mini.eastday.com/mobile/170426174040971.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170426/20170426174040_16397ef737c02c0283466512d7b687ab_5_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170426/20170426174040_16397ef737c02c0283466512d7b687ab_8_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170426/20170426174040_16397ef737c02c0283466512d7b687ab_7_mwpm_03200403.jpeg"},{"uniquekey":"2ccc0ac9958c1f038af8a06f782f8da4","title":"夏宝龙离任浙江省委书记时的真情告白","date":"2017-04-26 17:40","category":"头条","author_name":"浙江新闻","url":"http://mini.eastday.com/mobile/170426174029855.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170426/20170426174029_1c799e16dc12271078e34c59d9c72fd7_1_mwpm_03200403.jpeg"},{"uniquekey":"614e44cf403b0614cd6d70f9394f3129","title":"山东、浙江与河北：一日三省领导履新","date":"2017-04-26 17:37","category":"头条","author_name":"海运仓内参","url":"http://mini.eastday.com/mobile/170426173731602.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170426/20170426173731_eef17e39100ec083bb8223f5912d978c_3_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170426/20170426173731_eef17e39100ec083bb8223f5912d978c_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170426/20170426173731_eef17e39100ec083bb8223f5912d978c_4_mwpm_03200403.jpeg"},{"uniquekey":"d86921109b47bf0c6cfd23e5441963b1","title":"警惕！\"免费送\"\"全额返款\"成诱惑陷阱","date":"2017-04-26 17:35","category":"头条","author_name":"国际在线","url":"http://mini.eastday.com/mobile/170426173527840.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170426/20170426173527_1beddcadf9eeaf1ad7dbda47ca352d91_1_mwpm_03200403.jpeg"},{"uniquekey":"99968e63932ec7cc14d57069f65035f0","title":"石泰峰任宁夏自治区党委书记","date":"2017-04-26 17:27","category":"头条","author_name":"新华社","url":"http://mini.eastday.com/mobile/170426172747745.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170426/20170426172747_ea60cfbd9a8d93d2bd3a335f6d710058_1_mwpm_03200403.jpeg"},{"uniquekey":"8070d24beab7d32401a1628ac8ce0ce5","title":"韩国正式部署萨德 星州民众持续抗议 与警方冲突","date":"2017-04-26 17:25","category":"头条","author_name":"国际在线新闻","url":"http://mini.eastday.com/mobile/170426172534568.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170426/20170426172534_bd8564196ee4f1c2882f42dfd94eb8e6_2_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170426/20170426172534_bd8564196ee4f1c2882f42dfd94eb8e6_3_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170426/20170426172534_bd8564196ee4f1c2882f42dfd94eb8e6_1_mwpm_03200403.jpeg"},{"uniquekey":"8709485262670740b6ab82cfb5223ba3","title":"范爷不如她漂亮？18年前大黑牛差点娶了她，如今她儿子叫李晨爸","date":"2017-04-26 17:24","category":"头条","author_name":"街头小木头","url":"http://mini.eastday.com/mobile/170426172458957.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170426/20170426172458_bd934f80b2d01b53e9c0db927cc7e4d7_10_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170426/20170426172458_bd934f80b2d01b53e9c0db927cc7e4d7_6_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170426/20170426172458_bd934f80b2d01b53e9c0db927cc7e4d7_8_mwpm_03200403.jpeg"},{"uniquekey":"dee4a774f72e813303b284626fc6c997","title":"中国第二艘航母下水了，德国海天巨兽\u201c空天航母\u201d可不是设想！","date":"2017-04-26 17:24","category":"头条","author_name":"同族汇APP","url":"http://mini.eastday.com/mobile/170426172440264.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170426/20170426172440_19d8df390a77ef3fff86ca5b62b6fdc4_11_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170426/20170426172440_19d8df390a77ef3fff86ca5b62b6fdc4_9_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170426/20170426172440_19d8df390a77ef3fff86ca5b62b6fdc4_6_mwpm_03200403.jpeg"},{"uniquekey":"2bbbdc76e95c46d34862e26a2879df11","title":"娱乐圈内最干净的四位女星，低调不炒作，第二位连王思聪也不敢惹","date":"2017-04-26 17:24","category":"头条","author_name":"有瘾","url":"http://mini.eastday.com/mobile/170426172434441.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170426/20170426172434_8d00abadf81295ea6d6c8cda86cc4656_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170426/20170426172434_8d00abadf81295ea6d6c8cda86cc4656_7_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170426/20170426172434_8d00abadf81295ea6d6c8cda86cc4656_8_mwpm_03200403.jpeg"},{"uniquekey":"dd9d40510ee7b813127d67f5c4fe7d32","title":"黄晓明终于晒Baby孕照啦 甜美幸福打脸借腹生子传闻","date":"2017-04-26 17:21","category":"头条","author_name":"Yes娱乐网","url":"http://mini.eastday.com/mobile/170426172112138.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170426/20170426172112_f5a14f64ffbb6150a5bfb1ec009d2c9c_2_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170426/20170426172112_f5a14f64ffbb6150a5bfb1ec009d2c9c_1_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170426/20170426172112_f5a14f64ffbb6150a5bfb1ec009d2c9c_3_mwpm_03200403.jpeg"},{"uniquekey":"ad919d8c6b76f00183264c808ded36c3","title":"谢娜现身录快本让人心疼，张杰经纪人一路紧随护周全！","date":"2017-04-26 17:09","category":"头条","author_name":"扒八美少女","url":"http://mini.eastday.com/mobile/170426170904384.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170426/20170426170904_73f7ac9add7169045ffabe81db6504d2_9_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170426/20170426170904_73f7ac9add7169045ffabe81db6504d2_8_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170426/20170426170904_73f7ac9add7169045ffabe81db6504d2_6_mwpm_03200403.jpeg"},{"uniquekey":"62a2f4ea47398bb0da4b1b8c2cf38ff9","title":"安徽省副省长周春雨涉嫌严重违纪接受组织审查","date":"2017-04-26 17:03","category":"头条","author_name":"国际在线","url":"http://mini.eastday.com/mobile/170426170338012.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170426/20170426170338_4d2f4d6e0e3ee4a48036ccea605a9a9c_1_mwpm_03200403.jpeg"},{"uniquekey":"5ee72a6a1b161bb9912ca062d1caead0","title":"农村男子无意把一把米放入油锅中，随后的一幕令人惊奇！","date":"2017-04-26 17:01","category":"头条","author_name":"旅游奇闻","url":"http://mini.eastday.com/mobile/170426170153045.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170426/20170426_901998d428904a5eaf1632a4e18e526b_cover_mwpm_03200403.png","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170426/20170426_5fa21facc5706161f9f3d4242c4cf565_cover_mwpm_03200403.png","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170426/20170426_7271e703b786cc2222651080d34fe740_cover_mwpm_03200403.png"},{"uniquekey":"11742c2d19fbd2bc1dc71cd79e19704d","title":"日本复兴相再度出言不逊引咎辞职 安倍这次并未袒护","date":"2017-04-26 17:01","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170426170140029.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170426/20170426170140_593ac744027d275d14bf0e39498a9aeb_1_mwpm_03200403.jpeg"},{"uniquekey":"ace64e9dfe6e84328c6f1b0c63ae7df1","title":"文在寅就\u201c萨德\u201d部分组件凌晨运入发声明：无视民意","date":"2017-04-26 17:00","category":"头条","author_name":"央视新闻客户端","url":"http://mini.eastday.com/mobile/170426170033151.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170426/20170426170033_f3adccb236ac14bb782101126498aab8_1_mwpm_03200403.jpeg"},{"uniquekey":"ffcf8f7071f06051c1627984577fb270","title":"蔡英文发美对台军售妄言国台办：开历史倒车","date":"2017-04-26 16:54","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/170426165433844.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170426/20170426165433_d8c663df2967ec76331841a4ec3faac1_1_mwpm_03200403.jpeg"},{"uniquekey":"13308d7bff601e7867b7127962e51d20","title":"娶这几个生肖的女人回家 如虎添翼福禄寿三全","date":"2017-04-26 16:54","category":"头条","author_name":"运势北雅","url":"http://mini.eastday.com/mobile/170426165430451.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170426/20170426165430_99ee8faac4cf04cd3f840c427c20e14e_2_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170426/20170426165430_99ee8faac4cf04cd3f840c427c20e14e_3_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170426/20170426165430_99ee8faac4cf04cd3f840c427c20e14e_1_mwpm_03200403.jpeg"},{"uniquekey":"1c2e9c2db02bb49c06f5d0e0daf8e85e","title":"今天，中国军队干了件大事！雄起，中国海军！ ","date":"2017-04-26 16:52","category":"头条","author_name":"东方号","url":"http://mini.eastday.com/mobile/170426165246183.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170426/20170426165246_730a563b4b31096168ac7dbd6657cd12_3_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170426/20170426165246_730a563b4b31096168ac7dbd6657cd12_12_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170426/20170426165246_730a563b4b31096168ac7dbd6657cd12_2_mwpm_03200403.jpeg"},{"uniquekey":"7196f99f5f9e4a1d6a68bc167c50b113","title":"为什么那么多女人甘愿出卖自己？原来她们都来自这里！","date":"2017-04-26 16:48","category":"头条","author_name":"智娱智乐","url":"http://mini.eastday.com/mobile/170426164836871.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170426/20170426_fe5c0dfbfdc236958e44fbe401712115_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170426/20170426_891648ccded02bdc534941951e9ecdc9_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170426/20170426_2bd4f94d73cbb377b9df6246401eba86_cover_mwpm_03200403.jpeg"},{"uniquekey":"09d3930cea34a2157d2f047f252bc3b1","title":"俄外长：强硬手段解决朝鲜问题将会带来灾难性后果","date":"2017-04-26 16:44","category":"头条","author_name":"央视新闻客户端","url":"http://mini.eastday.com/mobile/170426164438299.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170426/20170426164438_841e1235f8051878b9d3b0f31420f655_1_mwpm_03200403.png"},{"uniquekey":"5286be6abb074e24753e89de0002bb26","title":"谢娜删掉有关张杰的恩爱微博，何炅用这句话还原真相打脸卓伟","date":"2017-04-26 16:44","category":"头条","author_name":"前创工作室","url":"http://mini.eastday.com/mobile/170426164416141.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170426/20170426_2770748e614bd972aae93b0890e48d05_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170426/20170426_a97b43f6ac917517ade49176d1ee09ba_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170426/20170426_985576d79f00cbbbdd5be53652cde97e_cover_mwpm_03200403.jpeg"},{"uniquekey":"c9b0da29a2de63b60057349269d0db87","title":"英拉下台：中国\u201c见死不救\u201d的真正原因曝光！","date":"2017-04-26 16:40","category":"头条","author_name":"三军军事","url":"http://mini.eastday.com/mobile/170426164015080.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170426/20170426_968dc48fc1c7ccb33e1f08ebd74fc4f4_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170426/20170426_0c9846b13eec6a53db1d74a0bf9e5456_cover_mwpm_03200403.png"},{"uniquekey":"206cf3e83110588181999147b6317b15","title":"\u201c党建+互联网\u201d 上海勇为先行者","date":"2017-04-26 16:31","category":"头条","author_name":"人民网-上海频道","url":"http://mini.eastday.com/mobile/170426163119027.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170426/20170426163119_beaafbdc3b2e58dc9dba1f3ffea326aa_3_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170426/20170426163119_beaafbdc3b2e58dc9dba1f3ffea326aa_4_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170426/20170426163119_beaafbdc3b2e58dc9dba1f3ffea326aa_6_mwpm_03200403.jpeg"},{"uniquekey":"89c4254583cfb270ffc60f14417c186a","title":"各国女兵的辣眼睛方式，只觉得中国最美，还有一张亮点十足","date":"2017-04-26 16:29","category":"头条","author_name":"全球未解真相国际","url":"http://mini.eastday.com/mobile/170426162920444.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170426/20170426_e45738d1e21af17af8934229094984d8_mwpm_03200403.png","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170426/20170426_9d8668f1ac66c40d87a4427faa737051_mwpm_03200403.png","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170426/20170426_14c6b2528015c4ae7e1d0513c718e107_mwpm_03200403.png"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : d42995b5d640a9ad83638e98a2d75b4d
             * title : 6艘载朝鲜煤炭船只在唐山港卸载 外交部：非进口
             * date : 2017-04-26 18:50
             * category : 头条
             * author_name : 外交部网站
             * url : http://mini.eastday.com/mobile/170426185048486.html
             * thumbnail_pic_s : http://08.imgmini.eastday.com/mobile/20170426/20170426185048_77082e34dd005461e7e2d249b69831eb_3_mwpm_03200403.jpeg
             * thumbnail_pic_s02 : http://08.imgmini.eastday.com/mobile/20170426/20170426185048_77082e34dd005461e7e2d249b69831eb_1_mwpm_03200403.jpeg
             * thumbnail_pic_s03 : http://08.imgmini.eastday.com/mobile/20170426/20170426185048_77082e34dd005461e7e2d249b69831eb_2_mwpm_03200403.jpeg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}