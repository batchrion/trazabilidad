/*!   GeneXus Java 15_0_3-111985 on November 30, 2017 10:10:4.79
*/
gx.evt.autoSkip=!1;gx.define("gx0010",!1,function(){var n,t;this.ServerClass="gx0010";this.PackageName="com.wms";this.setObjectType("web");this.hasEnterEvent=!0;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){this.AV13pCabEntradaMercanciaId=gx.fn.getIntegerValue("vPCABENTRADAMERCANCIAID",".")};this.Validv_Cocdocdate=function(){try{var n=gx.util.balloon.getNew("vCOCDOCDATE");if(this.AnyError=0,!(new gx.date.gxdate("").compare(this.AV10cOcDocDate)==0||new gx.date.gxdate(this.AV10cOcDocDate).compare(gx.date.ymdhmstot(1753,01,01,00,00,00))>=0))try{n.setError("Campo cOcDocDate fuera de rango");this.AnyError=gx.num.trunc(1,0)}catch(t){}}catch(t){}try{return n==null?!0:n.show()}catch(t){}return!0};this.Validv_Cocdocduedate=function(){try{var n=gx.util.balloon.getNew("vCOCDOCDUEDATE");if(this.AnyError=0,!(new gx.date.gxdate("").compare(this.AV11cOcDocDueDate)==0||new gx.date.gxdate(this.AV11cOcDocDueDate).compare(gx.date.ymdhmstot(1753,01,01,00,00,00))>=0))try{n.setError("Campo cOcDocDueDate fuera de rango");this.AnyError=gx.num.trunc(1,0)}catch(t){}}catch(t){}try{return n==null?!0:n.show()}catch(t){}return!0};this.e180h1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")=="AdvancedContainer"?(gx.fn.setCtrlProperty("ADVANCEDCONTAINER","Class","AdvancedContainer AdvancedContainerVisible"),gx.fn.setCtrlProperty("BTNTOGGLE","Class",gx.fn.getCtrlProperty("BTNTOGGLE","Class")+" BtnToggleActive")):(gx.fn.setCtrlProperty("ADVANCEDCONTAINER","Class","AdvancedContainer"),gx.fn.setCtrlProperty("BTNTOGGLE","Class","BtnToggle"));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}])};this.e110h1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("CABENTRADAMERCANCIAIDFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("CABENTRADAMERCANCIAIDFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCCABENTRADAMERCANCIAID","Visible",!0)):(gx.fn.setCtrlProperty("CABENTRADAMERCANCIAIDFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCCABENTRADAMERCANCIAID","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("CABENTRADAMERCANCIAIDFILTERCONTAINER","Class")',ctrl:"CABENTRADAMERCANCIAIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCCABENTRADAMERCANCIAID","Visible")',ctrl:"vCCABENTRADAMERCANCIAID",prop:"Visible"}])};this.e120h1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("OCDOCENTRYFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("OCDOCENTRYFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCOCDOCENTRY","Visible",!0)):(gx.fn.setCtrlProperty("OCDOCENTRYFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCOCDOCENTRY","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("OCDOCENTRYFILTERCONTAINER","Class")',ctrl:"OCDOCENTRYFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCOCDOCENTRY","Visible")',ctrl:"vCOCDOCENTRY",prop:"Visible"}])};this.e130h1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("PROVCARCODEFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("PROVCARCODEFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCPROVCARCODE","Visible",!0)):(gx.fn.setCtrlProperty("PROVCARCODEFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCPROVCARCODE","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("PROVCARCODEFILTERCONTAINER","Class")',ctrl:"PROVCARCODEFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCPROVCARCODE","Visible")',ctrl:"vCPROVCARCODE",prop:"Visible"}])};this.e140h1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("PROVCARDNAMEFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("PROVCARDNAMEFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCPROVCARDNAME","Visible",!0)):(gx.fn.setCtrlProperty("PROVCARDNAMEFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCPROVCARDNAME","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("PROVCARDNAMEFILTERCONTAINER","Class")',ctrl:"PROVCARDNAMEFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCPROVCARDNAME","Visible")',ctrl:"vCPROVCARDNAME",prop:"Visible"}])};this.e150h1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("OCDOCDATEFILTERCONTAINER","Class")=="AdvancedContainerItem"?gx.fn.setCtrlProperty("OCDOCDATEFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"):gx.fn.setCtrlProperty("OCDOCDATEFILTERCONTAINER","Class","AdvancedContainerItem");this.refreshOutputs([{av:'gx.fn.getCtrlProperty("OCDOCDATEFILTERCONTAINER","Class")',ctrl:"OCDOCDATEFILTERCONTAINER",prop:"Class"}])};this.e160h1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("OCDOCDUEDATEFILTERCONTAINER","Class")=="AdvancedContainerItem"?gx.fn.setCtrlProperty("OCDOCDUEDATEFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"):gx.fn.setCtrlProperty("OCDOCDUEDATEFILTERCONTAINER","Class","AdvancedContainerItem");this.refreshOutputs([{av:'gx.fn.getCtrlProperty("OCDOCDUEDATEFILTERCONTAINER","Class")',ctrl:"OCDOCDUEDATEFILTERCONTAINER",prop:"Class"}])};this.e170h1_client=function(){this.clearMessages();gx.fn.getCtrlProperty("EMPRESAFILTERCONTAINER","Class")=="AdvancedContainerItem"?(gx.fn.setCtrlProperty("EMPRESAFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCEMPRESA","Visible",!0)):(gx.fn.setCtrlProperty("EMPRESAFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCEMPRESA","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("EMPRESAFILTERCONTAINER","Class")',ctrl:"EMPRESAFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCEMPRESA","Visible")',ctrl:"vCEMPRESA",prop:"Visible"}])};this.e210h2_client=function(){this.executeServerEvent("ENTER",!0,arguments[0],!1,!1)};this.e220h1_client=function(){this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,85,86,87,88,89,90,91,92,93,94,95];this.GXLastCtrlId=95;this.Grid1Container=new gx.grid.grid(this,2,"WbpLvl2",84,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"gx0010",[],!1,1,!1,!0,10,!0,!1,!1,"",0,"px","Nueva fila",!0,!1,!1,null,null,!1,"",!1,[1,1,1,1],!1,0,!0,!1);t=this.Grid1Container;t.addBitmap("&Linkselection","vLINKSELECTION",85,0,"px",17,"px",null,"","","SelectionAttribute","WWActionColumn");t.addSingleLineEdit(24,86,"CABENTRADAMERCANCIAID","Id","","CabEntradaMercanciaId","int",0,"px",6,6,"right",null,[],24,"CabEntradaMercanciaId",!0,0,!1,!1,"Attribute",1,"WWColumn");t.addSingleLineEdit(1,87,"OCDOCENTRY","Oc Doc Entry","","OcDocEntry","int",0,"px",9,9,"right",null,[],1,"OcDocEntry",!0,0,!1,!1,"DescriptionAttribute",1,"WWColumn");t.addSingleLineEdit(3,88,"PROVCARCODE","Prov Car Code","","ProvCarCode","svchar",0,"px",15,15,"left",null,[],3,"ProvCarCode",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addSingleLineEdit(5,89,"OCDOCDATE","Oc Doc Date","","OcDocDate","dtime",0,"px",19,19,"right",null,[],5,"OcDocDate",!0,8,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addSingleLineEdit(6,90,"OCDOCDUEDATE","Oc Doc Due Date","","OcDocDueDate","dtime",0,"px",19,19,"right",null,[],6,"OcDocDueDate",!0,8,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addSingleLineEdit(10,91,"EMPRESA","Empresa","","Empresa","svchar",0,"px",7,7,"left",null,[],10,"Empresa",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");t.addSingleLineEdit(25,92,"USERNAME","por","","UserName","svchar",0,"px",40,40,"left",null,[],25,"UserName",!0,0,!1,!1,"Attribute",1,"WWColumn OptionalColumn");this.Grid1Container.emptyText="";this.setGrid(t);n[2]={fld:"",grid:0};n[3]={fld:"MAIN",grid:0};n[4]={fld:"",grid:0};n[5]={fld:"",grid:0};n[6]={fld:"ADVANCEDCONTAINER",grid:0};n[7]={fld:"",grid:0};n[8]={fld:"",grid:0};n[9]={fld:"CABENTRADAMERCANCIAIDFILTERCONTAINER",grid:0};n[10]={fld:"",grid:0};n[11]={fld:"",grid:0};n[12]={fld:"LBLCABENTRADAMERCANCIAIDFILTER",format:1,grid:0,evt:"e110h1_client"};n[13]={fld:"",grid:0};n[14]={fld:"",grid:0};n[15]={fld:"",grid:0};n[16]={lvl:0,type:"int",len:6,dec:0,sign:!1,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCCABENTRADAMERCANCIAID",gxz:"ZV6cCabEntradaMercanciaId",gxold:"OV6cCabEntradaMercanciaId",gxvar:"AV6cCabEntradaMercanciaId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV6cCabEntradaMercanciaId=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.ZV6cCabEntradaMercanciaId=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("vCCABENTRADAMERCANCIAID",gx.O.AV6cCabEntradaMercanciaId,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV6cCabEntradaMercanciaId=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("vCCABENTRADAMERCANCIAID",".")},nac:gx.falseFn};n[17]={fld:"",grid:0};n[18]={fld:"",grid:0};n[19]={fld:"OCDOCENTRYFILTERCONTAINER",grid:0};n[20]={fld:"",grid:0};n[21]={fld:"",grid:0};n[22]={fld:"LBLOCDOCENTRYFILTER",format:1,grid:0,evt:"e120h1_client"};n[23]={fld:"",grid:0};n[24]={fld:"",grid:0};n[25]={fld:"",grid:0};n[26]={lvl:0,type:"int",len:9,dec:0,sign:!1,pic:"ZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCOCDOCENTRY",gxz:"ZV7cOcDocEntry",gxold:"OV7cOcDocEntry",gxvar:"AV7cOcDocEntry",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV7cOcDocEntry=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.ZV7cOcDocEntry=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("vCOCDOCENTRY",gx.O.AV7cOcDocEntry,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV7cOcDocEntry=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("vCOCDOCENTRY",".")},nac:gx.falseFn};n[27]={fld:"",grid:0};n[28]={fld:"",grid:0};n[29]={fld:"PROVCARCODEFILTERCONTAINER",grid:0};n[30]={fld:"",grid:0};n[31]={fld:"",grid:0};n[32]={fld:"LBLPROVCARCODEFILTER",format:1,grid:0,evt:"e130h1_client"};n[33]={fld:"",grid:0};n[34]={fld:"",grid:0};n[35]={fld:"",grid:0};n[36]={lvl:0,type:"svchar",len:15,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCPROVCARCODE",gxz:"ZV8cProvCarCode",gxold:"OV8cProvCarCode",gxvar:"AV8cProvCarCode",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV8cProvCarCode=n)},v2z:function(n){n!==undefined&&(gx.O.ZV8cProvCarCode=n)},v2c:function(){gx.fn.setControlValue("vCPROVCARCODE",gx.O.AV8cProvCarCode,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV8cProvCarCode=this.val())},val:function(){return gx.fn.getControlValue("vCPROVCARCODE")},nac:gx.falseFn};n[37]={fld:"",grid:0};n[38]={fld:"",grid:0};n[39]={fld:"PROVCARDNAMEFILTERCONTAINER",grid:0};n[40]={fld:"",grid:0};n[41]={fld:"",grid:0};n[42]={fld:"LBLPROVCARDNAMEFILTER",format:1,grid:0,evt:"e140h1_client"};n[43]={fld:"",grid:0};n[44]={fld:"",grid:0};n[45]={fld:"",grid:0};n[46]={lvl:0,type:"svchar",len:100,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCPROVCARDNAME",gxz:"ZV9cProvCardName",gxold:"OV9cProvCardName",gxvar:"AV9cProvCardName",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV9cProvCardName=n)},v2z:function(n){n!==undefined&&(gx.O.ZV9cProvCardName=n)},v2c:function(){gx.fn.setControlValue("vCPROVCARDNAME",gx.O.AV9cProvCardName,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV9cProvCardName=this.val())},val:function(){return gx.fn.getControlValue("vCPROVCARDNAME")},nac:gx.falseFn};n[47]={fld:"",grid:0};n[48]={fld:"",grid:0};n[49]={fld:"OCDOCDATEFILTERCONTAINER",grid:0};n[50]={fld:"",grid:0};n[51]={fld:"",grid:0};n[52]={fld:"LBLOCDOCDATEFILTER",format:1,grid:0,evt:"e150h1_client"};n[53]={fld:"",grid:0};n[54]={fld:"",grid:0};n[55]={fld:"",grid:0};n[56]={lvl:0,type:"dtime",len:10,dec:8,sign:!1,ro:0,grid:0,gxgrid:null,fnc:this.Validv_Cocdocdate,isvalid:null,rgrid:[this.Grid1Container],fld:"vCOCDOCDATE",gxz:"ZV10cOcDocDate",gxold:"OV10cOcDocDate",gxvar:"AV10cOcDocDate",dp:{f:-1,st:!0,wn:!1,mf:!1,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[56],ip:[56],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV10cOcDocDate=gx.fn.toDatetimeValue(n))},v2z:function(n){n!==undefined&&(gx.O.ZV10cOcDocDate=gx.fn.toDatetimeValue(n))},v2c:function(){gx.fn.setControlValue("vCOCDOCDATE",gx.O.AV10cOcDocDate,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV10cOcDocDate=gx.fn.toDatetimeValue(this.val()))},val:function(){return gx.fn.getDateTimeValue("vCOCDOCDATE")},nac:gx.falseFn};n[57]={fld:"",grid:0};n[58]={fld:"",grid:0};n[59]={fld:"OCDOCDUEDATEFILTERCONTAINER",grid:0};n[60]={fld:"",grid:0};n[61]={fld:"",grid:0};n[62]={fld:"LBLOCDOCDUEDATEFILTER",format:1,grid:0,evt:"e160h1_client"};n[63]={fld:"",grid:0};n[64]={fld:"",grid:0};n[65]={fld:"",grid:0};n[66]={lvl:0,type:"dtime",len:10,dec:8,sign:!1,ro:0,grid:0,gxgrid:null,fnc:this.Validv_Cocdocduedate,isvalid:null,rgrid:[this.Grid1Container],fld:"vCOCDOCDUEDATE",gxz:"ZV11cOcDocDueDate",gxold:"OV11cOcDocDueDate",gxvar:"AV11cOcDocDueDate",dp:{f:-1,st:!0,wn:!1,mf:!1,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[66],ip:[66],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV11cOcDocDueDate=gx.fn.toDatetimeValue(n))},v2z:function(n){n!==undefined&&(gx.O.ZV11cOcDocDueDate=gx.fn.toDatetimeValue(n))},v2c:function(){gx.fn.setControlValue("vCOCDOCDUEDATE",gx.O.AV11cOcDocDueDate,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV11cOcDocDueDate=gx.fn.toDatetimeValue(this.val()))},val:function(){return gx.fn.getDateTimeValue("vCOCDOCDUEDATE")},nac:gx.falseFn};n[67]={fld:"",grid:0};n[68]={fld:"",grid:0};n[69]={fld:"EMPRESAFILTERCONTAINER",grid:0};n[70]={fld:"",grid:0};n[71]={fld:"",grid:0};n[72]={fld:"LBLEMPRESAFILTER",format:1,grid:0,evt:"e170h1_client"};n[73]={fld:"",grid:0};n[74]={fld:"",grid:0};n[75]={fld:"",grid:0};n[76]={lvl:0,type:"svchar",len:7,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCEMPRESA",gxz:"ZV12cEmpresa",gxold:"OV12cEmpresa",gxvar:"AV12cEmpresa",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV12cEmpresa=n)},v2z:function(n){n!==undefined&&(gx.O.ZV12cEmpresa=n)},v2c:function(){gx.fn.setControlValue("vCEMPRESA",gx.O.AV12cEmpresa,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV12cEmpresa=this.val())},val:function(){return gx.fn.getControlValue("vCEMPRESA")},nac:gx.falseFn};n[77]={fld:"",grid:0};n[78]={fld:"GRIDTABLE",grid:0};n[79]={fld:"",grid:0};n[80]={fld:"",grid:0};n[81]={fld:"BTNTOGGLE",grid:0};n[82]={fld:"",grid:0};n[83]={fld:"",grid:0};n[85]={lvl:2,type:"bits",len:1024,dec:0,sign:!1,ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vLINKSELECTION",gxz:"ZV5LinkSelection",gxold:"OV5LinkSelection",gxvar:"AV5LinkSelection",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.AV5LinkSelection=n)},v2z:function(n){n!==undefined&&(gx.O.ZV5LinkSelection=n)},v2c:function(n){gx.fn.setGridMultimediaValue("vLINKSELECTION",n||gx.fn.currentGridRowImpl(84),gx.O.AV5LinkSelection,gx.O.AV17Linkselection_GXI)},c2v:function(){gx.O.AV17Linkselection_GXI=this.val_GXI();this.val()!==undefined&&(gx.O.AV5LinkSelection=this.val())},val:function(n){return gx.fn.getGridControlValue("vLINKSELECTION",n||gx.fn.currentGridRowImpl(84))},val_GXI:function(n){return gx.fn.getGridControlValue("vLINKSELECTION_GXI",n||gx.fn.currentGridRowImpl(84))},gxvar_GXI:"AV17Linkselection_GXI",nac:gx.falseFn};n[86]={lvl:2,type:"int",len:6,dec:0,sign:!1,pic:"ZZZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"CABENTRADAMERCANCIAID",gxz:"Z24CabEntradaMercanciaId",gxold:"O24CabEntradaMercanciaId",gxvar:"A24CabEntradaMercanciaId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A24CabEntradaMercanciaId=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z24CabEntradaMercanciaId=gx.num.intval(n))},v2c:function(n){gx.fn.setGridControlValue("CABENTRADAMERCANCIAID",n||gx.fn.currentGridRowImpl(84),gx.O.A24CabEntradaMercanciaId,0)},c2v:function(){this.val()!==undefined&&(gx.O.A24CabEntradaMercanciaId=gx.num.intval(this.val()))},val:function(n){return gx.fn.getGridIntegerValue("CABENTRADAMERCANCIAID",n||gx.fn.currentGridRowImpl(84),".")},nac:gx.falseFn};n[87]={lvl:2,type:"int",len:9,dec:0,sign:!1,pic:"ZZZZZZZZ9",ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"OCDOCENTRY",gxz:"Z1OcDocEntry",gxold:"O1OcDocEntry",gxvar:"A1OcDocEntry",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A1OcDocEntry=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z1OcDocEntry=gx.num.intval(n))},v2c:function(n){gx.fn.setGridControlValue("OCDOCENTRY",n||gx.fn.currentGridRowImpl(84),gx.O.A1OcDocEntry,0)},c2v:function(){this.val()!==undefined&&(gx.O.A1OcDocEntry=gx.num.intval(this.val()))},val:function(n){return gx.fn.getGridIntegerValue("OCDOCENTRY",n||gx.fn.currentGridRowImpl(84),".")},nac:gx.falseFn};n[88]={lvl:2,type:"svchar",len:15,dec:0,sign:!1,ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"PROVCARCODE",gxz:"Z3ProvCarCode",gxold:"O3ProvCarCode",gxvar:"A3ProvCarCode",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){n!==undefined&&(gx.O.A3ProvCarCode=n)},v2z:function(n){n!==undefined&&(gx.O.Z3ProvCarCode=n)},v2c:function(n){gx.fn.setGridControlValue("PROVCARCODE",n||gx.fn.currentGridRowImpl(84),gx.O.A3ProvCarCode,0)},c2v:function(){this.val()!==undefined&&(gx.O.A3ProvCarCode=this.val())},val:function(n){return gx.fn.getGridControlValue("PROVCARCODE",n||gx.fn.currentGridRowImpl(84))},nac:gx.falseFn};n[89]={lvl:2,type:"dtime",len:10,dec:8,sign:!1,ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"OCDOCDATE",gxz:"Z5OcDocDate",gxold:"O5OcDocDate",gxvar:"A5OcDocDate",dp:{f:0,st:!0,wn:!1,mf:!1,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A5OcDocDate=gx.fn.toDatetimeValue(n))},v2z:function(n){n!==undefined&&(gx.O.Z5OcDocDate=gx.fn.toDatetimeValue(n))},v2c:function(n){gx.fn.setGridControlValue("OCDOCDATE",n||gx.fn.currentGridRowImpl(84),gx.O.A5OcDocDate,0)},c2v:function(){this.val()!==undefined&&(gx.O.A5OcDocDate=gx.fn.toDatetimeValue(this.val()))},val:function(n){return gx.fn.getGridDateTimeValue("OCDOCDATE",n||gx.fn.currentGridRowImpl(84))},nac:gx.falseFn};n[90]={lvl:2,type:"dtime",len:10,dec:8,sign:!1,ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"OCDOCDUEDATE",gxz:"Z6OcDocDueDate",gxold:"O6OcDocDueDate",gxvar:"A6OcDocDueDate",dp:{f:0,st:!0,wn:!1,mf:!1,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A6OcDocDueDate=gx.fn.toDatetimeValue(n))},v2z:function(n){n!==undefined&&(gx.O.Z6OcDocDueDate=gx.fn.toDatetimeValue(n))},v2c:function(n){gx.fn.setGridControlValue("OCDOCDUEDATE",n||gx.fn.currentGridRowImpl(84),gx.O.A6OcDocDueDate,0)},c2v:function(){this.val()!==undefined&&(gx.O.A6OcDocDueDate=gx.fn.toDatetimeValue(this.val()))},val:function(n){return gx.fn.getGridDateTimeValue("OCDOCDUEDATE",n||gx.fn.currentGridRowImpl(84))},nac:gx.falseFn};n[91]={lvl:2,type:"svchar",len:7,dec:0,sign:!1,ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"EMPRESA",gxz:"Z10Empresa",gxold:"O10Empresa",gxvar:"A10Empresa",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){n!==undefined&&(gx.O.A10Empresa=n)},v2z:function(n){n!==undefined&&(gx.O.Z10Empresa=n)},v2c:function(n){gx.fn.setGridControlValue("EMPRESA",n||gx.fn.currentGridRowImpl(84),gx.O.A10Empresa,0)},c2v:function(){this.val()!==undefined&&(gx.O.A10Empresa=this.val())},val:function(n){return gx.fn.getGridControlValue("EMPRESA",n||gx.fn.currentGridRowImpl(84))},nac:gx.falseFn};n[92]={lvl:2,type:"svchar",len:40,dec:0,sign:!1,ro:1,isacc:0,grid:84,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"USERNAME",gxz:"Z25UserName",gxold:"O25UserName",gxvar:"A25UserName",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){n!==undefined&&(gx.O.A25UserName=n)},v2z:function(n){n!==undefined&&(gx.O.Z25UserName=n)},v2c:function(n){gx.fn.setGridControlValue("USERNAME",n||gx.fn.currentGridRowImpl(84),gx.O.A25UserName,0)},c2v:function(){this.val()!==undefined&&(gx.O.A25UserName=this.val())},val:function(n){return gx.fn.getGridControlValue("USERNAME",n||gx.fn.currentGridRowImpl(84))},nac:gx.falseFn};n[93]={fld:"",grid:0};n[94]={fld:"",grid:0};n[95]={fld:"BTN_CANCEL",grid:0};this.AV6cCabEntradaMercanciaId=0;this.ZV6cCabEntradaMercanciaId=0;this.OV6cCabEntradaMercanciaId=0;this.AV7cOcDocEntry=0;this.ZV7cOcDocEntry=0;this.OV7cOcDocEntry=0;this.AV8cProvCarCode="";this.ZV8cProvCarCode="";this.OV8cProvCarCode="";this.AV9cProvCardName="";this.ZV9cProvCardName="";this.OV9cProvCardName="";this.AV10cOcDocDate=gx.date.nullDate();this.ZV10cOcDocDate=gx.date.nullDate();this.OV10cOcDocDate=gx.date.nullDate();this.AV11cOcDocDueDate=gx.date.nullDate();this.ZV11cOcDocDueDate=gx.date.nullDate();this.OV11cOcDocDueDate=gx.date.nullDate();this.AV12cEmpresa="";this.ZV12cEmpresa="";this.OV12cEmpresa="";this.ZV5LinkSelection="";this.OV5LinkSelection="";this.Z24CabEntradaMercanciaId=0;this.O24CabEntradaMercanciaId=0;this.Z1OcDocEntry=0;this.O1OcDocEntry=0;this.Z3ProvCarCode="";this.O3ProvCarCode="";this.Z5OcDocDate=gx.date.nullDate();this.O5OcDocDate=gx.date.nullDate();this.Z6OcDocDueDate=gx.date.nullDate();this.O6OcDocDueDate=gx.date.nullDate();this.Z10Empresa="";this.O10Empresa="";this.Z25UserName="";this.O25UserName="";this.AV6cCabEntradaMercanciaId=0;this.AV7cOcDocEntry=0;this.AV8cProvCarCode="";this.AV9cProvCardName="";this.AV10cOcDocDate=gx.date.nullDate();this.AV11cOcDocDueDate=gx.date.nullDate();this.AV12cEmpresa="";this.AV13pCabEntradaMercanciaId=0;this.A4ProvCardName="";this.AV5LinkSelection="";this.A24CabEntradaMercanciaId=0;this.A1OcDocEntry=0;this.A3ProvCarCode="";this.A5OcDocDate=gx.date.nullDate();this.A6OcDocDueDate=gx.date.nullDate();this.A10Empresa="";this.A25UserName="";this.Events={e210h2_client:["ENTER",!0],e220h1_client:["CANCEL",!0],e180h1_client:["'TOGGLE'",!1],e110h1_client:["LBLCABENTRADAMERCANCIAIDFILTER.CLICK",!1],e120h1_client:["LBLOCDOCENTRYFILTER.CLICK",!1],e130h1_client:["LBLPROVCARCODEFILTER.CLICK",!1],e140h1_client:["LBLPROVCARDNAMEFILTER.CLICK",!1],e150h1_client:["LBLOCDOCDATEFILTER.CLICK",!1],e160h1_client:["LBLOCDOCDUEDATEFILTER.CLICK",!1],e170h1_client:["LBLEMPRESAFILTER.CLICK",!1]};this.EvtParms.REFRESH=[[{av:"GRID1_nFirstRecordOnPage",nv:0},{av:"GRID1_nEOF",nv:0},{av:"subGrid1_Rows",nv:0},{av:"AV6cCabEntradaMercanciaId",fld:"vCCABENTRADAMERCANCIAID",pic:"ZZZZZ9",nv:0},{av:"AV7cOcDocEntry",fld:"vCOCDOCENTRY",pic:"ZZZZZZZZ9",nv:0},{av:"AV8cProvCarCode",fld:"vCPROVCARCODE",pic:"",nv:""},{av:"AV9cProvCardName",fld:"vCPROVCARDNAME",pic:"",nv:""},{av:"AV10cOcDocDate",fld:"vCOCDOCDATE",pic:"99/99/9999 99:99:99",nv:""},{av:"AV11cOcDocDueDate",fld:"vCOCDOCDUEDATE",pic:"99/99/9999 99:99:99",nv:""},{av:"AV12cEmpresa",fld:"vCEMPRESA",pic:"",nv:""}],[]];this.EvtParms.START=[[],[{ctrl:"FORM",prop:"Caption"}]];this.EvtParms["'TOGGLE'"]=[[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}]];this.EvtParms["LBLCABENTRADAMERCANCIAIDFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("CABENTRADAMERCANCIAIDFILTERCONTAINER","Class")',ctrl:"CABENTRADAMERCANCIAIDFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("CABENTRADAMERCANCIAIDFILTERCONTAINER","Class")',ctrl:"CABENTRADAMERCANCIAIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCCABENTRADAMERCANCIAID","Visible")',ctrl:"vCCABENTRADAMERCANCIAID",prop:"Visible"}]];this.EvtParms["LBLOCDOCENTRYFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("OCDOCENTRYFILTERCONTAINER","Class")',ctrl:"OCDOCENTRYFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("OCDOCENTRYFILTERCONTAINER","Class")',ctrl:"OCDOCENTRYFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCOCDOCENTRY","Visible")',ctrl:"vCOCDOCENTRY",prop:"Visible"}]];this.EvtParms["LBLPROVCARCODEFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("PROVCARCODEFILTERCONTAINER","Class")',ctrl:"PROVCARCODEFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("PROVCARCODEFILTERCONTAINER","Class")',ctrl:"PROVCARCODEFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCPROVCARCODE","Visible")',ctrl:"vCPROVCARCODE",prop:"Visible"}]];this.EvtParms["LBLPROVCARDNAMEFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("PROVCARDNAMEFILTERCONTAINER","Class")',ctrl:"PROVCARDNAMEFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("PROVCARDNAMEFILTERCONTAINER","Class")',ctrl:"PROVCARDNAMEFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCPROVCARDNAME","Visible")',ctrl:"vCPROVCARDNAME",prop:"Visible"}]];this.EvtParms["LBLOCDOCDATEFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("OCDOCDATEFILTERCONTAINER","Class")',ctrl:"OCDOCDATEFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("OCDOCDATEFILTERCONTAINER","Class")',ctrl:"OCDOCDATEFILTERCONTAINER",prop:"Class"}]];this.EvtParms["LBLOCDOCDUEDATEFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("OCDOCDUEDATEFILTERCONTAINER","Class")',ctrl:"OCDOCDUEDATEFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("OCDOCDUEDATEFILTERCONTAINER","Class")',ctrl:"OCDOCDUEDATEFILTERCONTAINER",prop:"Class"}]];this.EvtParms["LBLEMPRESAFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("EMPRESAFILTERCONTAINER","Class")',ctrl:"EMPRESAFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("EMPRESAFILTERCONTAINER","Class")',ctrl:"EMPRESAFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCEMPRESA","Visible")',ctrl:"vCEMPRESA",prop:"Visible"}]];this.EvtParms.LOAD=[[],[{av:"AV5LinkSelection",fld:"vLINKSELECTION",pic:"",nv:""}]];this.EvtParms.ENTER=[[{av:"A24CabEntradaMercanciaId",fld:"CABENTRADAMERCANCIAID",pic:"ZZZZZ9",hsh:!0,nv:0}],[{av:"AV13pCabEntradaMercanciaId",fld:"vPCABENTRADAMERCANCIAID",pic:"ZZZZZ9",nv:0}]];this.EvtParms.GRID1_FIRSTPAGE=[[{av:"GRID1_nFirstRecordOnPage",nv:0},{av:"GRID1_nEOF",nv:0},{av:"subGrid1_Rows",nv:0},{av:"AV6cCabEntradaMercanciaId",fld:"vCCABENTRADAMERCANCIAID",pic:"ZZZZZ9",nv:0},{av:"AV7cOcDocEntry",fld:"vCOCDOCENTRY",pic:"ZZZZZZZZ9",nv:0},{av:"AV8cProvCarCode",fld:"vCPROVCARCODE",pic:"",nv:""},{av:"AV9cProvCardName",fld:"vCPROVCARDNAME",pic:"",nv:""},{av:"AV10cOcDocDate",fld:"vCOCDOCDATE",pic:"99/99/9999 99:99:99",nv:""},{av:"AV11cOcDocDueDate",fld:"vCOCDOCDUEDATE",pic:"99/99/9999 99:99:99",nv:""},{av:"AV12cEmpresa",fld:"vCEMPRESA",pic:"",nv:""}],[]];this.EvtParms.GRID1_PREVPAGE=[[{av:"GRID1_nFirstRecordOnPage",nv:0},{av:"GRID1_nEOF",nv:0},{av:"subGrid1_Rows",nv:0},{av:"AV6cCabEntradaMercanciaId",fld:"vCCABENTRADAMERCANCIAID",pic:"ZZZZZ9",nv:0},{av:"AV7cOcDocEntry",fld:"vCOCDOCENTRY",pic:"ZZZZZZZZ9",nv:0},{av:"AV8cProvCarCode",fld:"vCPROVCARCODE",pic:"",nv:""},{av:"AV9cProvCardName",fld:"vCPROVCARDNAME",pic:"",nv:""},{av:"AV10cOcDocDate",fld:"vCOCDOCDATE",pic:"99/99/9999 99:99:99",nv:""},{av:"AV11cOcDocDueDate",fld:"vCOCDOCDUEDATE",pic:"99/99/9999 99:99:99",nv:""},{av:"AV12cEmpresa",fld:"vCEMPRESA",pic:"",nv:""}],[]];this.EvtParms.GRID1_NEXTPAGE=[[{av:"GRID1_nFirstRecordOnPage",nv:0},{av:"GRID1_nEOF",nv:0},{av:"subGrid1_Rows",nv:0},{av:"AV6cCabEntradaMercanciaId",fld:"vCCABENTRADAMERCANCIAID",pic:"ZZZZZ9",nv:0},{av:"AV7cOcDocEntry",fld:"vCOCDOCENTRY",pic:"ZZZZZZZZ9",nv:0},{av:"AV8cProvCarCode",fld:"vCPROVCARCODE",pic:"",nv:""},{av:"AV9cProvCardName",fld:"vCPROVCARDNAME",pic:"",nv:""},{av:"AV10cOcDocDate",fld:"vCOCDOCDATE",pic:"99/99/9999 99:99:99",nv:""},{av:"AV11cOcDocDueDate",fld:"vCOCDOCDUEDATE",pic:"99/99/9999 99:99:99",nv:""},{av:"AV12cEmpresa",fld:"vCEMPRESA",pic:"",nv:""}],[]];this.EvtParms.GRID1_LASTPAGE=[[{av:"GRID1_nFirstRecordOnPage",nv:0},{av:"GRID1_nEOF",nv:0},{av:"subGrid1_Rows",nv:0},{av:"AV6cCabEntradaMercanciaId",fld:"vCCABENTRADAMERCANCIAID",pic:"ZZZZZ9",nv:0},{av:"AV7cOcDocEntry",fld:"vCOCDOCENTRY",pic:"ZZZZZZZZ9",nv:0},{av:"AV8cProvCarCode",fld:"vCPROVCARCODE",pic:"",nv:""},{av:"AV9cProvCardName",fld:"vCPROVCARDNAME",pic:"",nv:""},{av:"AV10cOcDocDate",fld:"vCOCDOCDATE",pic:"99/99/9999 99:99:99",nv:""},{av:"AV11cOcDocDueDate",fld:"vCOCDOCDUEDATE",pic:"99/99/9999 99:99:99",nv:""},{av:"AV12cEmpresa",fld:"vCEMPRESA",pic:"",nv:""}],[]];this.setVCMap("AV13pCabEntradaMercanciaId","vPCABENTRADAMERCANCIAID",0,"int");t.addRefreshingVar(this.GXValidFnc[16]);t.addRefreshingVar(this.GXValidFnc[26]);t.addRefreshingVar(this.GXValidFnc[36]);t.addRefreshingVar(this.GXValidFnc[46]);t.addRefreshingVar(this.GXValidFnc[56]);t.addRefreshingVar(this.GXValidFnc[66]);t.addRefreshingVar(this.GXValidFnc[76]);this.Initialize()});gx.createParentObj(gx0010)