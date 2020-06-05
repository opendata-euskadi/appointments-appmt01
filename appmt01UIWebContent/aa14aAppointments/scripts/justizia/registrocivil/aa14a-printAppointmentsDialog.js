$(document).ready(function(){
	$("div[id^= 'loc_']").hide();
	$("div[id^= 'sch_']").hide();
	$("input:radio[name='locTh']")
		.change(function() {
						var outLocTh;
						if ($("input:radio[name='locTh']").length) {
							outLocTh = $("input:radio[name='locTh']:checked").val()
						}
						$("div[id^= 'sch_']").hide();
						$("div[id^= 'loc_']").hide(); 
						$("div[id='loc_" + outLocTh + "']").show();
				  });
	$("input:radio[name='serviceLocId']")
	.change(function() {
					var outLocId;
					var outLocTh;
					if ($("input:radio[name='serviceLocId']").length) {
						outLocId = $("input:radio[name='serviceLocId']:checked").val()
					}
					
					if ($("input:radio[name='locTh']").length) {
						outLocTh = $("input:radio[name='locTh']:checked").val()
					}
					// get the selected location group
					$("div[id^= 'loc_']").hide();
					$("div[id^= 'sch_']").hide();
					$("div[id='loc_" + outLocTh + "']").show();
					if(outLocId == "JUSTIZIA_REGISTRO_CIVIL_BIL"){
						$("div[id='sch_bil']").show();
					}
					else if (outLocId == "JUSTIZIA_REGISTRO_CIVIL_BK"){
						$("div[id='sch_bk']").show();
					}
					
			  });
});

