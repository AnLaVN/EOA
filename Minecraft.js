var app = angular.module("MyApp", ["ngRoute"]);

	app.controller("DLCCtrl", function ($scope){
		$scope.ListDLC = [
			{Image: "https://www.minecraft.net/content/dam/games/dungeons/logos/dungeons-pmp-dlcbundle-boxart-500x500.jpg", Name: "GÓI DLC ULTIMATE", Text: "Bạn đã chơi Minecraft Dungeons, nhưng bây giờ đã đến lúc xem toàn bộ câu chuyện với Gói DLC Ultimate! Chơi qua tất cả DLC và trải nghiệm câu chuyện từ đầu đến cuối."},
			{Image: "https://www.minecraft.net/content/dam/games/dungeons/logos/dungeons-pmp-void-boxart-500x500.jpg", Name: "TIẾNG VỌNG TỪ HƯ KHÔNG", Text: "Trải nghiệm The End với DLC Echoing Void! Đối mặt với kẻ thù mới, thu thập trang bị và vượt qua các nhiệm vụ mới đầy thử thách để kết thúc cuộc chiến này-một lần và mãi mãi."},
			{Image: "https://www.minecraft.net/content/dam/games/minecraft/logos/Dungeons-PMP_DLC-Hidden-Depths_Boxart-500x500.jpg", Name: "ẨN SÂU", Text: "Hòa mình vào cuộc phiêu lưu tiếp theo của bạn với DLC Minecraft Dungeons: Hidden Depths mới! Chuẩn bị và tạo nên sự nổi bật với các nhiệm vụ mới, kho báu bị chìm và kẻ thù."},
			{Image: "https://www.minecraft.net/content/dam/games/dungeons/logos/Dungeons-PMP_DLC-Flame-of-the-Nether_Boxart-500x500_03.jpg", Name: "NGỌN LỬA ĐỊA NGỤC", Text: "Minecraft Dungeons mang đến sức nóng cho Nether với DLC đầy tham vọng nhất cho đến nay. Đừng bỏ lỡ các nhiệm vụ mới, các địa điểm rực lửa và các vật phẩm độc đáo!"},
			{Image: "https://www.minecraft.net/content/dam/games/dungeons/logos/Dungeons-PMP_DLC-Howling-Peaks_Boxart-500x500_02.jpg", Name: "ĐỈNH CAO TUYỆT VỜI", Text: "Nguy hiểm đang chờ đợi trên đỉnh những đỉnh núi hùng vĩ, và sẽ cần một anh hùng để ngăn chặn cơn bão đang hình thành! Con đường lên đỉnh sẽ dẫn bạn đến với đám đông, nhiệm vụ và trang bị mới-đừng nhìn xuống."},
			{Image: "https://www.minecraft.net/content/dam/games/dungeons/logos/boxart-dlc2.jpg", Name: "VƯỢT QUA MÙA ĐÔNG", Text: "Những vùng đất băng giá này rất cần một anh hùng! Dũng cảm thực hiện các nhiệm vụ mới và đánh bại đám đông tàn nhẫn trên hành trình đánh bại Wraith khốn khổ ở trung tâm của cơn bão. DLC này được bao gồm trong Phiên bản Hero."},
			{Image: "https://www.minecraft.net/content/dam/games/dungeons/logos/boxart-dlc1.jpg", Name: "RỪNG RẬM THỨC TỈNH", Text: "Khi các mối đe dọa trỗi dậy dưới tán rừng rậm, bạn phải cứu những vùng đất đầy lá này. Thực hiện các nhiệm vụ mới, chiến đấu với đám đông mới và chiến đấu với Jungle Abomination hùng mạnh! DLC này được bao gồm trong Phiên bản Hero."},
		]
		$scope.ScrollUp = function(){
			window.scrollTo({ top: 0, behavior: 'smooth' });
		}
	});
	app.controller("NewDungeonsCtrl", function ($scope){
		$scope.ListNew = [
			{Image: "https://www.minecraft.net/content/dam/games/dungeons/logos/vinyl_1x1.jpg", Name: "MINECRAFT TRÊN VINYL!", Text:"Những ngọn đồi sống động với âm thanh lo-fi!"},
			{Image: "https://www.minecraft.net/content/dam/games/dungeons/screenshots/trotation-1x1.jpg", Name: "VÒNG XOAY THÁP MỚI", Text: "Trải nghiệm các tầng mới trong Tháp - mỗi tuần!"},
			{Image: "https://www.minecraft.net/content/dam/games/dungeons/screenshots/tower-co-op-1x1.jpg", Name: "THÁP VÀ TEAM", Text: "Thử thách cao nhất của Minecraft Dungeons là nhiều người chơi!"},
			{Image: "https://www.minecraft.net/content/dam/games/dungeons/key-art/spookyfall22-1x1.jpg", Name: "MÙA THU TUYỆT VỜI", Text: "Bóng đêm đang vẫy gọi bạn, liệu bạn sẽ bỏ cuộc..."}
		]
	});
	app.controller("NewLegendsCtrl", function ($scope){
		$scope.ListNew = [
			{Image: "https://www.minecraft.net/content/dam/games/badger/game-characters/Legends_newfriends_tile.jpg", Name: "KẺ THÙ CŨ TRỞ THÀNH BẠN MỚI", Text:"Những đồng minh quen thuộc nhưng không ngờ tới trong Legends"},
			{Image: "https://www.minecraft.net/content/dam/games/badger/screenshots/Legends_PVPDD_tile.jpg", Name: "NHẬT KÝ PHÁT TRIỂN: PVP", Text: "Các nhà phát triển nói về xây dựng chiến lược, cạnh tranh tài nguyên, v.v."},
			{Image: "https://www.minecraft.net/content/dam/games/badger/game-characters/golems-tile-1x1F.jpg", Name: "GOLEMS CỦA MINECRAFT LEGENDS", Text: "Những người bạn đồng hành dũng cảm, sẵn sàng bảo vệ Tân Thế Giới"},
			{Image: "https://www.minecraft.net/content/dam/games/badger/game-characters/Legends_MobdDD_tile.jpg", Name: "NHẬT KÝ PHÁT TRIỂN ĐÃ RA MẮT", Text: "Chúng tôi nói về những người bạn quen, kẻ thù cũ, và mũ đội đầu."}
		]
	});
	app.controller("MarketplaceCtrl", function ($scope) {
		$scope.Item = {Image: "", Text: "", Price:""}
		$scope.ListItem = [
			{Dindex:-1, Image: "", Text: "", Price:""},
			{Dindex:-1, Image: "https://www.minecraft.net/content/dam/games/dungeons/key-art/boxart-standardedition.jpg", Text:"Chiến đấu theo cách của bạn thông qua trò chơi phiêu lưu hành động hoàn toàn mới, lấy cảm hứng từ trình thu thập thông tin trong hầm ngục cổ điển và lấy bối cảnh trong vũ trụ Minecraft! Tối đa bốn người bạn có thể chơi cùng nhau hoặc bạn có thể dũng cảm vượt ngục một mình. Chiến đấu với đám đông mới và khó chịu ở các cấp độ cực kỳ đa dạng, đầy kho báu, đầy hành động, tất cả trong một nhiệm vụ hoành tráng để đánh bại Arch-Illager độc ác!", Price:"$19.99"},
			{Dindex:-1, Image: "https://www.minecraft.net/content/dam/games/dungeons/logos/dungeons-pmp-ultedit-boxart-500x500.jpg", Text: "Trải nghiệm toàn bộ câu chuyện về Dungeon Minecraft từ đầu đến cuối! Trải nghiệm Minecraft Dungeons: Ultimate Edition, bao gồm trò chơi cơ bản và tất cả sáu DLC. Chọn Phiên bản cuối cùng có nghĩa là bạn có được trải nghiệm đầy đủ với mức giá thấp hơn so với khi mua riêng. Nhận bản sao của bạn ngày hôm nay!", Price:"$39.99"},
			{Dindex:-1, Image: "https://www.minecraft.net/content/dam/games/dungeons/key-art/MCD-PMP_Buy-Module_Adventure-Pass_500x500.jpg", Text: "Khám phá một hệ thống tiến triển hoàn toàn mới và mở khóa các phần thưởng theo mùa thông qua các thử thách giới hạn thời gian hoặc khám phá Tòa tháp bí ẩn-một công trình kiến trúc cao vút để thử thách kỹ năng của bạn.", Price:"$3.99"},
			{Dindex:-1, Image: "https://www.minecraft.net/content/dam/games/dungeons/key-art/MCD_Buy-Module_S2-Luminous-Night_500x500.jpg", Text: "Trở thành hình đại diện một lần nữa và kiếm những phần thưởng rạng rỡ mới trong Đêm dạ quang-cuộc phiêu lưu theo mùa thứ hai của Minecraft Dungeons. Khám phá Tháp về đêm trong một ánh sáng hoàn toàn mới, với các tầng bao gồm những bức tranh tường bí ẩn, những câu đố khó hiểu và những kẻ thù rực lửa. Những thách thức mới và các tính năng chất lượng cuộc sống đang chờ đón bạn-bạn sẽ khám phá điều gì trước bình minh?", Price:"$3.99"},
			{Dindex:-1, Image: "https://www.minecraft.net/content/dam/games/dungeons/key-art/MCD_Buy-Module_S3-Fauna-Faire_500x500.jpg", Text: "Hãy đến một, đến tất cả và tận hưởng lễ kỷ niệm lành mạnh nhất trong Thế giới bên kia, bao gồm một loạt các hoạt động cho cả bạn và bạn bè của bạn!", Price:"$3.99"},
			{Dindex: 0, Image: "https://www.minecraft.net/content/dam/games/dungeons/logos/dungeons-pmp-dlcbundle-boxart-500x500.jpg", Text: "Bạn đã chơi câu chuyện chính của Minecraft Dungeons, nhưng bây giờ là lúc để xem cho đến hết! Chọn tất cả sáu DLC với Gói DLC tối thượng-câu chuyện hoàn chỉnh về Arch-Illager và Quả cầu thống trị. Với gói này, bạn sẽ nhận được tất cả sáu DLC với mức giá thấp hơn so với khi bạn mua riêng chúng.", Price:"$19.99"},
			{Dindex: 6, Image: "https://www.minecraft.net/content/dam/games/dungeons/logos/boxart-dlc1.jpg", Text: "Chỉ bạn mới có thể chiến đấu chống lại sự phát triển quá mức đang gầm gừ để giải phóng khu rừng xa xôi này khỏi một thế lực bí ẩn. Con đường đầy nguy hiểm-những kẻ thù mới và những câu đố nguy hiểm đang chờ đợi trong bóng râm. Tìm áo giáp, vũ khí và đồ tạo tác mới khi bạn tìm cách nhổ tận gốc nguồn gốc của sự thối nát độc ác: Jungle Abomination. DLC này được bao gồm trong Phiên bản anh hùng.", Price:"$5.99"},
			{Dindex: 5, Image: "https://www.minecraft.net/content/dam/games/dungeons/logos/boxart-dlc2.jpg", Text: "Một mùa đông khủng khiếp lan rộng khắp vùng đất, nuốt chửng mọi thứ mà nó chạm vào-và trung tâm của cơn bão là Wraith Khốn khổ. Cơ hội duy nhất để ngăn chặn băng giá là để một anh hùng đối mặt với những nhiệm vụ mới và những kẻ thù không ngừng. Săn lùng nguồn tham nhũng và khám phá áo giáp, vũ khí và đồ tạo tác mới! DLC này được bao gồm trong Phiên bản anh hùng.", Price:"$5.99"},
			{Dindex: 4, Image: "https://www.minecraft.net/content/dam/games/dungeons/logos/Dungeons-PMP_DLC-Howling-Peaks_Boxart-500x500_02.jpg", Text: "Một sức mạnh kỳ lạ nắm giữ trên đỉnh những đỉnh núi nguy hiểm, và một anh hùng dũng cảm phải vươn lên đỉnh để đánh bại nó. Chuyến đi lên đỉnh có những thăng trầm táo bạo, từ áo giáp, vũ khí và đồ tạo tác mới rực rỡ cho đến những kẻ thù mới hung ác. Ở trung tâm của cơn bão là Tempest Golem, phải dừng lại để làm dịu đi những cơn gió hú.", Price:"$5.99"},
			{Dindex: 3, Image: "https://www.minecraft.net/content/dam/games/dungeons/logos/Dungeons-PMP_DLC-Flame-of-the-Nether_Boxart-500x500_03.jpg", Text: "Minecraft Dungeons đang hướng đến Nether! Bản DLC này bùng nổ với nội dung mới dành cho những người đủ dũng cảm để đương đầu với những thử thách lớn nhất. Nhận Flames of the Nether ngay bây giờ và đừng bỏ lỡ tất cả các tính năng hấp dẫn nhất cũng như các nhiệm vụ, thiết bị, mob và mỹ phẩm mới.", Price:"$5.99"},
			{Dindex: 2, Image: "https://www.minecraft.net/content/dam/games/minecraft/logos/Dungeons-PMP_DLC-Hidden-Depths_Boxart-500x500.jpg", Text: "Tạo sự nổi bật với Độ sâu ẩn! Một nạn tham nhũng lan rộng đã chạm đến độ sâu đen tối nhất của đại dương và hiện đang đe dọa sự lên xuống tự nhiên của quyền lực. Chiến đấu với kẻ thù mới, khám phá trang bị mới và chứng minh rằng các kỹ năng anh hùng của bạn không chỉ hoàn hảo-chúng còn có khả năng chống thấm nước.", Price:"$5.99"},
			{Dindex: 1, Image: "https://www.minecraft.net/content/dam/games/dungeons/logos/dungeons-pmp-void-boxart-500x500.jpg", Text: "Bạn đã theo dõi câu chuyện về Arch-Illager và tìm thấy các mảnh vỡ từ Quả cầu thống trị-giờ đã đến lúc đi đến Điểm kết thúc. Chương cuối cùng của Minecraft Dungeons mở ra trong Echoing Void, DLC mới nhất. Đối mặt với kẻ thù mới, thu thập trang bị và vượt qua các nhiệm vụ mới đầy thử thách để kết thúc cuộc chiến này-một lần và mãi mãi.", Price:"$5.99"}
		]
	});
	app.controller("CartCtrl", function ($scope){
		$scope.ListItem=[
			{Img:"https://cdn.shopify.com/s/files/1/0266/4841/2351/products/MC-PF-CREEPER-100357-MF_180x.png", Name:"Bộ Bài Minecraft Tiêu Chuẩn Mặt Creeper ", Text:"Bộ bài tiêu chuẩn với gương mặt Creeper làm điểm nhấn. Hứa hẹn sẽ đem đến cho con em bạn những giờ giải trí vui vẻ nhất.", Price:15.95, Quan:1, Total:0},
			{Img:"https://cdn.shopify.com/s/files/1/0266/4841/2351/products/MC-PF-ENDER-100357-MF_180x.png", Name:"Bộ Bài Minecraft Tiêu Chuẩn Mặt Enderman", Text:"Bộ bài tiêu chuẩn với gương mặt Enderman làm điểm nhấn. Hứa hẹn sẽ đem đến cho con em bạn những giờ giải trí vui vẻ nhất.", Price:15.95, Quan:2, Total:0},
			{Img:"https://cdn.shopify.com/s/files/1/0266/4841/2351/products/DSC_8593_180x.jpg", Name:"Áo len Minecraft Creeper", Text:"Chiếc áo len phong cách Creeper này sẽ giúp bạn giữ ấm giữa mùa đông giá rét, ai lại cần crush khi đã có áo len.", Price:64.95, Quan:1, Total:0},
		]
		$scope.getTotal = function(){
			var Total = 0
			for(var i = 0; i < $scope.ListItem.length; i++){
				var total = $scope.ListItem[i].Total
				Total += total*1;
			}
			return Total.toFixed(2);
		}
		$scope.Delete = function(index){
			$scope.ListItem.splice(index, 1);
		}
	});
	app.controller("DetailCtrl", function ($scope, $routeParams){
		$scope.index = $routeParams.index
		$scope.ListDLC=[
			{	BImage:"https://www.minecraft.net/content/dam/games/dungeons/key-art/dlc-pmp-dlcbundle-landscape-hero-1800x525.jpg",
				FImage:"https://www.minecraft.net/content/dam/games/dungeons/background-images/dlc-pmp-dlcbundle-herotrans-950x75.png",
				PImage:"https://www.minecraft.net/content/dam/games/dungeons/screenshots/ultimate-dlc-bundle/dlc-pmp-dlcbundle-gallery10-1000x570.jpg",
				Color: "rgb(15, 96, 78)",
				Tittle:"MINECRAFT DUNGEONS: GÓI DLC ULTIMATE",
				Content:"Trải nghiệm câu chuyện ngoài trò chơi cơ bản với Minecraft Dungeons: Gói Ultimate DLC. Bạn đã chơi câu chuyện chính, nhưng bây giờ là lúc để xem nó cho đến hết! Chiến đấu với vô số mob, khám phá các cấp độ nhảy kích thước và khám phá những kho báu chưa kể khi bạn hoàn thành câu chuyện về Quả cầu thống trị. Mua Gói DLC Ultimate và nhận tất cả sáu DLC: Rừng Rậm Thức Tỉnh, Vượt Qua Mùa Đông, Đỉnh Cao Tuyệt Vời, Ngọn Lửa Địa Ngục, Ẩn Sâu và Tiếng Vọng Từ Hư Không. Bằng cách mua gói, bạn sẽ nhận được tất cả sáu DLC với mức giá thấp hơn so với khi bạn mua chúng riêng lẻ. Hoàn thành câu chuyện với Gói DLC cuối cùng!",
				Price:19.99,
				Features: ["Bao gồm tất cả sáu DLC", "Cũng bao gồm Áo choàng anh hùng, hai skin người chơi và pet gà", "Khám phá các cấp độ mới và thu thập các vật phẩm độc đáo", "Chiến đấu với đám đông mới và khám phá các nhiệm vụ bí mật"]
			},
			{	BImage:"https://www.minecraft.net/content/dam/games/dungeons/key-art/dlc-pmp-void-landscape-hero-1800x525.jpg",
				FImage:"https://www.minecraft.net/content/dam/games/dungeons/background-images/dlc-pmp-void-herotrans-950x75.png",
				PImage:"https://www.minecraft.net/content/dam/games/dungeons/screenshots/echoing-void/MCD_DLC6_EchoingVoid_BrokenCitadel-02.png",
				Color:"rgb(70, 2, 89)",
				Tittle:"ĐẾN CUỐI CÙNG",
				Content:"Bạn đã theo dõi câu chuyện về Arch-Illager và tìm thấy các mảnh vỡ từ Quả cầu thống trị, và bây giờ là lúc để đi đến THE END. Đi đến phần kết của câu chuyện Minecraft Dungeons với DLC mới nhất-Tiếng Vọng Từ Hư Không! Đối mặt với những kẻ thù mới, thu thập thiết bị và vượt qua các nhiệm vụ đầy thử thách để kết thúc cuộc chiến này một cách tốt đẹp. Có thể đáng sợ khi đi vào nơi chưa biết và đối mặt với Ngày tận thế, nhưng hãy nhớ rằng kho báu thực sự là những người bạn mà bạn kết bạn trên đường đi! Kho báu thực sự là tuyệt vời mặc dù.",
				Price:5.99,
				Features: ["Ba nhiệm vụ mới", "Mob và kẻ thù hoàn toàn mới", "Vũ khí, thiết bị và đồ tạo tác mới", "Hai skin mới và một thú cưng"]
			},
			{	BImage:"https://www.minecraft.net/content/dam/games/minecraft/key-art/DLC-PMP_Hidden-Depths_Landscape-Hero-1800x525.jpg",
				FImage:"https://www.minecraft.net/content/dam/games/dungeons/background-images/DLC-PMP_Hidden-Depths_Pixel-Transition-950x75.png",
				PImage:"https://www.minecraft.net/content/dam/games/dungeons/screenshots/hidden-depths/MCD_DLC5_HiddenDepths_AbyssalMonument_01.png",
				Color:"rgb(4, 55, 68)",
				Tittle:"ĐẢO NGƯỢC",
				Content:"Hòa mình vào cuộc phiêu lưu tiếp theo của bạn với DLC Minecraft Dungeons: Ẩn Sâu mới! Một mảnh vỡ từ Quả cầu thống trị mang theo một dòng chảy đen tối giờ đây đánh thức những sinh vật đã ngủ quên từ lâu dưới những con sóng. Tất cả phụ thuộc vào bạn để giải phóng thủy cung khỏi sự thối nát. Quân đoàn kẻ thù bị chìm và chết đuối ẩn nấp giữa các kho báu bị mất, vì vậy bạn phải luôn cảnh giác trước mọi nguy hiểm tiềm ẩn. Vẻ đẹp tự nhiên của đại dương có thể khiến bạn quên đi những nguy hiểm dưới đáy biển sâu, nhưng vũ khí, thiết bị và đồ tạo tác mới sẽ khiến mọi thứ trở nên sôi động.",
				Price:5.99,
				Features: ["Ba nhiệm vụ dưới nước mới", "Một sự pha trộn của mob nước mặn mới và kẻ thù", "Vũ khí, thiết bị và đồ tạo tác mới", "Hai skin mới và thú cưng rùa con"]
			},
			{	BImage:"https://www.minecraft.net/content/dam/games/dungeons/key-art/DLC-PMP_Flame-of-the-Nether_Landscape-Hero-1800x525.jpg",
				FImage:"https://www.minecraft.net/content/dam/games/dungeons/background-images/Dungeons-PMP_DLC-Flame-of-the-Nether_Pixel-Transition-950x75.png",
				PImage:"https://www.minecraft.net/content/dam/games/dungeons/screenshots/MCD_DLC4_FlamesoftheNether_Thumbnail_1920x1080.png",
				Color:"rgb(117, 25, 88)",
				Tittle:"CHƠI VỚI LỬA",
				Content:"Minecraft Dungeons đang mang lại sức nóng với DLC mới nhất, Ngọn Lửa Địa Ngục! Hành trình đến trung tâm của Địa Ngục trong sáu nhiệm vụ mới sẽ cho phép bạn khám phá các quần xã sinh vật quen thuộc theo một cách hoàn toàn mới. Cuộc phiêu lưu phía trước sẽ mang đến những đồ tạo tác, vũ khí và thiết bị mới cho những ai đủ dũng cảm để đối mặt với cơn thịnh nộ dữ dội của đám đông nguy hiểm ở Địa Ngục. Không phải mọi thứ đều đáng sợ và sẵn sàng để bắt bạn, vì bạn cũng sẽ nhận được thú cưng Baby Ghast mới cùng với hai giao diện mới! Đảm bảo bạn có DLC mới nhất và không bỏ lỡ nội dung Minecraft Dungeons tham vọng nhất cho đến nay.",
				Price:5.99,
				Features: ["Sáu nhiệm vụ Địa Ngục mới", "Hạ gục kẻ thù mới từ Nether", "Vũ khí, thiết bị và đồ tạo tác mới", "Hai skin mới và thú cưng Baby Ghast"]
			},
			{	BImage:"https://www.minecraft.net/content/dam/games/dungeons/key-art/DLC-PMP_Howling-Peaks_Landscape-Hero-1200x350_02.jpg",
				FImage:"https://www.minecraft.net/content/dam/games/dungeons/background-images/DLC-PMP_Howling-Peaks_Hero-Trans-950x75_02.png",
				PImage:"https://www.minecraft.net/content/dam/games/dungeons/screenshots/howling-peaks/DLC-PMP_Howling-Peaks_Gallery-01-1000x570.jpg",
				Color:"rgb(0, 95, 115)",
				Tittle:"ĐI LÊN ĐỈNH",
				Content:"Một sức mạnh kỳ lạ đã làm hư hỏng những đỉnh núi từng cô đơn của một dãy núi xa xôi, và giờ đây nó đe dọa chiếm lấy thế giới bằng cơn bão. Chuyến đi lên đỉnh có những thăng trầm kịch tính, từ áo giáp, vũ khí và đồ tạo tác mới rực rỡ cho đến những kẻ thù mới hung ác giữa các vách đá. Những kẻ thù mới như Squall Golem và Người Leo Núi chờ đợi bất kỳ ai đủ can đảm ở đỉnh núi để đánh cắp gốc rễ sức mạnh của chúng. Đứng đầu tất cả là nguồn gốc của cuộc xung đột dữ dội, Tempest Golem, phải bị đánh bại trước khi mọi hy vọng bị thổi bay.",
				Price:5.99,
				Features: ["Khám phá ba nhiệm vụ mới thú vị", "Gặp phải đám đông đáng sợ mới", "Hạ gục Golem Tempest", "Giữ vững lập trường của bạn chống lại những cơn gió quét", "Vũ khí, áo giáp và đồ tạo tác mới"]
			},
			{	BImage:"https://www.minecraft.net/content/dam/games/dungeons/key-art/pmp-dungeons-hero-dlc2-2700.jpg",
				FImage:"https://www.minecraft.net/content/dam/games/dungeons/background-images/hero-trans-dlc2-blue.png",
				PImage:"https://www.minecraft.net/content/dam/games/dungeons/screenshots/pmp-dlc2-trailer-poster.jpg",
				Color:"rgb(22, 41, 83)",
				Tittle:"CHỐNG LẠI SƯƠNG GIÁ",
				Content:"Một mùa đông khủng khiếp đang dần xâm chiếm mọi thứ mà nó chạm vào, và nguồn sức mạnh lạnh giá của nó là một sinh vật mạnh mẽ được gọi là Wraith Khốn khổ. Để ngăn chặn mùa đông không bao giờ kết thúc trong những dấu vết băng giá của nó, một anh hùng cao quý phải nhận nhiệm vụ mới ở những vùng đất bị mắc kẹt dưới độ không. Sẽ không chỉ có những cơn gió mùa đông tìm cách ném anh hùng khỏi con đường của họ để tiêu diệt Wraith khốn khổ, mà những kẻ thù mới như Illusioner và Iceologer sẽ tham gia vào cuộc chiến! Khi bạn truy tìm sự thối nát, bạn sẽ khám phá ra áo giáp, vũ khí và đồ tạo tác mới bên dưới lớp tuyết và mưa đá. Giữ mát và giữ chắc tay, vì sương giá không thể tha thứ được. DLC này được bao gồm trong Phiên bản anh hùng.",
				Price:5.99,
				Features: ["Trượt băng", "Vũ khí, áo giáp và đồ tạo tác mới", "Đối mặt với Wraith khốn khổ", "Chiến đấu với Illusioner và Iceologer", "Đảm nhận 3 nhiệm vụ hoàn toàn mới"]
			},
			{	BImage:"https://www.minecraft.net/content/dam/games/dungeons/key-art/pmp-dungeons-hero-dlc1-2700.jpg",
				FImage:"https://www.minecraft.net/content/dam/games/dungeons/background-images/hero-trans-dlc1-green.png",
				PImage:"https://www.minecraft.net/content/dam/games/dungeons/screenshots/pmp-dlc1-trailer-poster.jpg",
				Color:"rgb(55, 77, 15)",
				Tittle:"TẤT CẢ TRÊN CÂY NHO",
				Content:"Một nguồn sức mạnh không thể tin được đã rơi xuống giữa những dây leo ngoằn ngoèo của một khu rừng xa xôi, nguy hiểm. Sức mạnh bí ẩn này đã lan rộng ảnh hưởng của nó thông qua những dây leo hèn hạ, và giờ đây những nỗi kinh hoàng mới nở rộ - chẳng hạn như Leapleaf và Whisperer. Đi qua ba nhiệm vụ mới sẽ đưa bạn đến trung tâm của khu rừng, nơi bạn sẽ tìm thấy vũ khí, áo giáp và đồ tạo tác mới. Cuộc hành trình này dành cho những anh hùng dũng cảm nhất, vì tất cả những dây leo và con đường ngoằn ngoèo đều dẫn đến nguồn gốc của sự thối nát: Rừng Rậm Gớm Ghiếc. Con quái vật này phải bị xử lý để khôi phục lại sự cân bằng cho khu rừng, vì vậy hãy tấn công thật chính xác và di chuyển nhanh chóng. DLC này được bao gồm trong Phiên bản anh hùng.",
				Price:5.99,
				Features: ["Vũ khí, áo giáp và đồ tạo tác mới", "Tham gia Rừng Rậm Gớm Ghiếc", "Chiến đấu với Leapleaf và Whisperer", "Chiến đấu qua 3 nhiệm vụ mới"]
			},
		]
	});


	app.config(function ($routeProvider) {
		$routeProvider
			.when("/Dungeons", {
				templateUrl: "MinecraftDungeons.html"
			})
			.when("/DLC/:index", {
				templateUrl: "MinecraftDLC.html"
			})
			.when("/Legends", {
				templateUrl: "MinecraftLegends.html"
			})
			.when("/Cart", {
				templateUrl: "MinecraftCart.html"
			})
			.otherwise({
				redirectTo: "/Dungeons"
			});
	});
	app.run(function ($rootScope) {
		$rootScope.loading = false;
		$rootScope.$on('$routeChangeStart', function(){
			$rootScope.loading = true;
		});
		$rootScope.$on('$routeChangeSuccess', function(){
			$rootScope.loading = false;
		});
		$rootScope.$on('$routeChangeError', function(){
			$rootScope.loading = false;
			alert("Lỗi không thể tải route");
		});
		console.log($rootScope.loading)
	});