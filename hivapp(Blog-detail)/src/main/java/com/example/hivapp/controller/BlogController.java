package com.example.hivapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @GetMapping
    public String showBlogList() {
        return "blog"; // Danh sách bài viết
    }

    @GetMapping("/{id}")
    public String showBlogDetail(@PathVariable("id") Long id, Model model) {

        if (id == 1) {
            model.addAttribute("title", "Tầm quan trọng của việc điều trị ARV đúng cách");
            model.addAttribute("content", "<b>ARV là gì?</b><br><br>"+
            "ARV là thuốc kháng HIV (Antiretroviral drug), ARV ức chế sự nhân lên của vi rút, duy trì nồng độ vi rút trong máu ở mức thấp nhất có thể. Khi một người bị nhiễm HIV, HIV làm suy yếu hệ miễn dịch, do vậy nếu được điều trị bằng thuốc ARV, nồng độ vi rút trong máu thấp nên hệ miễn dịch vì thế mà không bị ảnh hưởng. Hầu hết người nhiễm HIV đang điều trị ARV hiện nay vẫn khỏe mạnh, lao động, học tập, có gia đình hạnh phúc, sinh con khỏe mạnh bình thường. Các nhà khoa học đã chứng minh rằng: một người nhiễm HIV, được điều trị bằng thuốc kháng vi rút (ARV) và khi đạt tải lượng vi rút ở ngưỡng không phát hiện được trong máu thì nguy cơ lây truyền HIV sang người khác qua đường tình dục rất thấp từ không đáng kể đến không có nguy cơ. Không đáng kể ở đây được hiểu là: quá nhỏ bé hoặc không quan trọng, không đáng để xem xét hoặc không có ý nghĩa.<br><br>"+
            "Tải lượng vi rút không phát hiện được định nghĩa là khi có dưới 200 bản sao/ml máu. Điều này có ý nghĩa: một người nhiễm HIV được điều trị ARV khi có tải lượng vi rút dưới ngưỡng phát hiện sẽ vừa bảo vệ sức khoẻ cho người sống chung với HIV và ngăn ngừa lây nhiễm HIV sang bạn tình.<br><br>"+
            "<b>ARV - nhân đôi hiệu quả</b><br><br>"+
            "Các nghiên cứu của Tổ chức y tế Thế giới tìm ra liệu pháp mới cho Dự phòng HIV là: Điều trị dự phòng trước phơi nhiễm HIV bằng thuốc kháng HIV (PrEP) giúp cho những người chưa bị nhiễm HIV nhưng có nguy cơ cao, có thể dự phòng lây nhiễm HIV tới trên 90% qua đường tình dục. PrEP là sử dụng thuốc kháng vi rút (ARV) để dự phòng lây nhiễm HIV ở người có nguy cơ cao chưa bị nhiễm HIV, giúp phòng ngừa lây nhiễm HIV trong cơ thể bằng cách ngăn cản sự xâm nhập, phát triển của HIV. Do vậy, nếu dùng đúng cách, đều đặn và đủ liều có thể phòng lây nhiễm HIV lên đến trên 90% qua đường tình dục ở những người có nguy cơ cao lây nhiễm HIV.<br><br>"+
            "Như vậy, thuốc kháng vi rút (ARV) giúp cho việc dự phòng lây nhiễm HIV đã trở nên hiệu quả hơn và dễ dàng hơn.  Thuốc ARV sẽ giúp cho người nhiễm HIV sống khỏe mạnh, không làm lây truyền HIV qua đường tình dục khi người nhiễm HIV đạt được tình trạng “không phát hiện HIV” trong máu. Thuốc ARV cũng giúp dự phòng lây nhiễm HIV cho người chưa nhiễm HIV. Do đó, dù bạn có tình trạng HIV âm tính hay dương tính cũng không còn là vấn đề nếu bạn được tiếp cận và sử dụng thuốc ARV theo hướng dẫn của thầy thuốc."
            );
        } else if (id == 2) {
            model.addAttribute("title", "Hiểu về tải lượng virus (Viral Load)");
            model.addAttribute("content", "<b>Tải lượng virus HIV là gì?</b><br><br>"+
            "Tải lượng virus HIV là lượng virus HIV có trong máu của người nhiễm. Xét nghiệm tải lượng virus đo số lượng bản sao HIV trong mỗi ml máu.<br><br>"+
            "Để đo tải lượng virus HIV cần thực hiện xét nghiệm PCR HIV RNA. Phương pháp này sử dụng huyết thanh để đếm số lượng bản sao của HIV, có giá trị trong theo dõi đáp ứng điều trị ARV, và có ý nghĩa trong chẩn đoán thất bại điều trị, kháng thuốc ARV. PCR HIV RNA không áp dụng trong chẩn đoán có nhiễm HIV hay không nhiễm HIV.<br><br>"+
            "Tải lượng virus HIV giúp dự đoán tiến triển của bệnh. Càng nhiều HIV trong máu (tức là tải lượng virus cao), số lượng tế bào CD4 trong cơ thể sẽ giảm nhanh hơn, và nguy cơ mắc bệnh do HIV sẽ cao hơn. Nếu sử dụng đúng cách, thuốc điều trị HIV (được gọi là liệu pháp kháng virus hoặc ART) có thể làm giảm tải lượng virus HIV xuống mức rất thấp, giúp hệ miễn dịch hoạt động và ngăn ngừa bệnh tật. Quá trình này được gọi là ức chế virus.<br><br>"+
            "Người nhiễm HIV sử dụng thuốc điều trị HIV theo chỉ định sẽ duy trì tải lượng virus ở mức không phát hiện được. Ở mức này, người bệnh có thể sống lâu, khỏe mạnh, và không lây truyền HIV cho bạn tình âm tính với HIV qua quan hệ tình dục. Ngoài ra, lượng virus HIV trong tinh dịch không có cũng sẽ không bị lây HIV khi nuốt phải tinh trùng.<br><br>"+
            "<b>Tải lượng virus HIV không phát hiện là gì?</b><br><br>"+
            "Lượng virus thấp đến mức xét nghiệm tiêu chuẩn trong phòng thí nghiệm không thể phát hiện được gọi là có tải lượng virus ở mức không thể phát hiện được. Theo Cục Phòng, chống HIV/AIDS (Bộ Y tế), tải lượng virus HIV dưới ngưỡng phát hiện được quy ước là dưới 200 bản sao/ml máu.<br><br>"+
            "Hầu hết tất cả những người dùng thuốc điều trị HIV theo quy định đều có thể đạt được tải lượng virus ở mức không thể phát hiện được. Thông thường, trong vòng 6 tháng sau khi bắt đầu điều trị, tải lượng virus có thể đạt được mức này.<br><br>"+
            "Mức tải lượng virus thấp như vậy cho thấy điều trị đang kiểm soát tốt sự nhân lên của virus. Khi tải lượng virus ở mức không phát hiện được, nguy cơ lây truyền HIV qua quan hệ tình dục gần như bằng không.<br><br>"+
            "<b>Tải lượng virus HIV bao nhiêu là cao?</b><br><br>"+
            "Tải lượng virus HIV 200 bản sao/ml máu được quy ước là mức tải lượng không phát hiện được. Ở mức tải lượng này, bệnh được kiểm soát tốt và không có khả năng lây truyền cho người khác. Theo đó, tải lượng trên mức 200 bản sao/ml máu có thể xem là cao và cần được theo dõi để có những thay đổi phù hợp trong điều trị.<br><br>"+
            "<b>Tải lượng virus HIV dưới 20 là cao hay thấp?</b><br><br>"+
            "Tải lượng virus HIV dưới 20 bản sao/ml được coi là rất thấp. Mức tải lượng này thường được xem là “không phát hiện được” vì nó nằm dưới ngưỡng phát hiện của nhiều loại xét nghiệm hiện đại. Đây là một dấu hiệu tích cực, cho thấy liệu pháp ART đang hoạt động hiệu quả và virus HIV đã bị ức chế đến mức không thể phát hiện trong máu.<br><br>"+
            "<b>Tải lượng virus HIV dưới 50 là cao hay thấp?</b><br><br>"+
            "Tương tự tải lượng dưới 20, tải lượng virus HIV dưới 50 bản sao/ml được coi là rất thấp và là mức tải lượng “không phát hiện được”. Ở mức tải lượng này, liệu pháp ART đang hoạt động hiệu quả và không không có khả năng lây truyền sang người âm tính với HIV."
            );
        } else if (id == 3) {
            model.addAttribute("title", "Phòng tránh lây nhiễm HIV");
            model.addAttribute("content", "<b>8 cách đơn giản ai cũng nên biết để bảo vệ bản thân, phòng ngừa lây nhiễm HIV</b><br><br>"+
            "<b>1. Biết được những yếu tố rủi ro</b><br><br>"+
            "<br>Phòng ngừa HIV bắt đầu bằng cách hiểu rõ sự thật - hiểu các phương thức lây truyền khác nhau và xác định các hoạt động có thể khiến bạn gặp rủi ro.<br>"+
            "<br>HIV lây nhiễm khi tiếp xúc trực tiếp với tinh dịch, dịch trước khi xuất tinh, máu, dịch âm đạo, dịch trực tràng và sữa mẹ. Do đó, các nguy cơ chủ yếu lây truyền HIV là quan hệ tình dục qua đường hậu môn, âm đạo và dùng chung bơm kim tiêm. HIV cũng có thể lây từ mẹ sang con trong quá trình mang thai, sinh nở hoặc cho con bú (còn gọi là sự lây truyền HIV chu sinh). Một số người có nguy cơ nhiễm HIV do phơi nhiễm nghề nghiệp (chẳng hạn như vết thương do kim đâm, truyền máu, vết xước do cạo râu, vết mổ)...<br>"+
            "<br>HIV không thể lây lan khi chạm vào nhau, ôm hôn nhau, muỗi đốt, sử dụng chung đồ dùng thông thường, nhà vệ sinh, bồn rửa, vòi uống nước, khạc nhổ.<br>"+
            "<b>2. Dùng PrEP dự phòng trước phơi nhiễm HIV</b><br><br>"+
            "<br>Dự phòng trước phơi nhiễm HIV (PrEP) là một chiến lược phòng ngừa sử dụng một liều thuốc điều trị HIV hàng ngày, được gọi là thuốc kháng virus, có thể giảm tới trên 90% nguy cơ nhiễm HIV. Theo Trung tâm Kiểm soát và Phòng ngừa Dịch bệnh Hoa Kỳ (CDC), tất cả những người trưởng thành và thanh thiếu niên có hoạt động tình dục nên được giáo dục về PrEP.<br>"+
            "<br>PrEP là sự kết hợp của 2 loại thuốc kháng virus để dự phòng lây nhiễm HIV. PrEP được khuyến nghị cho bất kỳ ai có nhiều nguy cơ nhiễm HIV. PrEP cần phải được sử dụng một lần mỗi ngày hoặc theo chỉ định của bác sĩ. Khi dừng, thuốc sẽ hết tác dụng bảo vệ.<br>"+
            "<b>3. Không phát hiện = Không lây truyền</b><br><br>"+
            "<br>K = K (Không phát hiện = Không lây truyền) là một chiến lược dựa trên bằng chứng. Có nghĩa là những người đã có HIV được điều trị bằng thuốc kháng virus ARV mỗi ngày để đạt được ức chế tải lượng virus HIV dưới 200 bản sao/ml máu - tải lượng này không thể phát hiện được và đồng nghĩa với việc không thể truyền virus cho người khác. Tải lượng HIV dưới 200 bản sao/ml máu thường đạt được sau 6 tháng điều trị.<br>"+
            "<b>4. Luôn sử dụng bao cao su khi quan hệ tình dục</b><br><br>"+
            "<br>Bao cao su luôn là một biện pháp phòng ngừa lây nhiễm HIV được khuyến cáo sử dụng nhiều nhất. Luôn sử dụng bao cao su cho mỗi lần quan hệ tình dục, kể cả khi quan hệ qua đường hậu môn hay âm đạo, bao cao su vẫn được cho là phương tiện đáng tin cậy nhất để ngừa thai, phòng ngừa nhiễm HIV và các bệnh lây truyền qua đường tình dục (STDs) khác.<br>"+
            "<br>Bạn cần lưu ý rằng, ngăn ngừa STDs là rất quan trọng vì chúng có thể làm tăng nguy cơ nhiễm HIV bằng cách làm tổn thương các mô âm đạo hoặc hậu môn mỏng manh. Điều này không chỉ đúng với bệnh giang mai, bệnh lậu gây ra vết loét hở mà còn với bất kỳ bệnh lây truyền qua đường tình dục nào gây viêm nhiễm bộ phận sinh dục.<br>"+
            "<b>5. Thụ thai an toàn</b><br><br>"+
            "<br>Trong gần một nửa số cặp vợ chồng sống chung với HIV sẽ có 1 người dương tính với HIV và người kia âm tính với HIV. <br>"+
            "<br>Với những tiến bộ trong điều trị HIV, ngày nay các cặp vợ chồng có cơ hội thụ thai lớn hơn bao giờ hết. Người nhiễm HIV vẫn có khả năng mang thai đồng thời giảm thiểu nguy cơ lây truyền sang bạn tình không nhiễm HIV.<br>"+
            "<br>Trên thực tế, sự kết hợp giữa PrEP và tải lượng virus không thể phát hiện (K = K) sẽ đảm bảo khả năng bảo vệ chống lại sự lây truyền trong các mối quan hệ một người \"có H\" và một người không nhiễm.<br>"+
            "<b>6. Tránh lây truyền từ mẹ sang con</b><br><br>"+
            "<br>Dự phòng lây truyền HIV từ mẹ sang con bao gồm tất cả các giai đoạn của thai kỳ. Do việc sàng lọc HIV thường xuyên trong thời kỳ mang thai, việc lây truyền từ mẹ sang con thường được kiểm soát chặt chẽ.<br>"+
            "<br>Bằng cách cho người mẹ điều trị bằng thuốc kháng virus sớm khi mới mang thai, nguy cơ lây truyền là rất thấp. Sự lây truyền HIV chu sinh có thể ngăn ngừa được, rất nhiều bằng chứng đã cho thấy việc sử dụng thuốc điều trị HIV kết hợp với các chiến lược khác đã giúp giảm nguy cơ lây HIV từ mẹ sang con xuống dưới 1%. Ngay cả khi điều trị được bắt đầu muộn hơn trong thai kỳ, nguy cơ lây truyền sang con vẫn dưới 2%. Vì HIV có thể được tìm thấy trong sữa mẹ, vì vậy cũng nên tránh cho con bú.<br>"+
            "<b>7. Tránh dùng chung kim tiêm</b><br><br>"+
            "<br>Tỷ lệ nhiễm HIV trong nhóm tiêm chích ma túy cao. Các nghiên cứu cho thấy rằng có từ 20-40% người tiêm chích ma túy bị nhiễm HIV do sử dụng chung bơm kim tiêm. Và không chỉ những người tiêm chích ma túy có nguy cơ mắc bệnh, bạn tình của họ cũng có thể gặp rủi ro, đặc biệt nếu họ không biết bạn tình của mình sử dụng ma túy. Các chương trình bơm kim tiêm sạch đã được chứng minh là làm giảm đáng kể nguy cơ nhiễm HIV và các bệnh như viêm gan B, C ở những người tiêm chích ma túy bằng cách không dùng chung bơm kim tiêm.<br>"+
            "<b>8. Ngăn ngừa HIV sau khi phơi nhiễm</b><br><br>"+
            "<br>Nếu bạn nghi ngờ rằng mình đã bị phơi nhiễm HIV qua quan hệ tình dục không sử dụng bao cao su hoặc các hoạt động có nguy cơ cao khác, bạn có thể dùng thuốc điều trị HIV trong 28 ngày để có khả năng ngăn chặn sự lây nhiễm.<br>"+
            "Được gọi là phương pháp điều trị dự phòng sau phơi nhiễm (PEP), chiến lược này hoạt động tốt nhất nếu được bắt đầu ngay sau khi tiếp xúc với virus. Nghiên cứu đã chỉ ra rằng PEP có thể giảm tới 81% nguy cơ nhiễm HIV nếu bắt đầu trong vòng 72 giờ. Nếu vô tình tiếp xúc với HIV, bạn càng bắt đầu điều trị càng sớm thì càng tốt."
            );
        } else {
            model.addAttribute("title", "Không tìm thấy bài viết");
            model.addAttribute("content", "Bài viết bạn yêu cầu không tồn tại.");
        }

        return "blog-detail";
    }
}


