/*!   GeneXus Java 15_0_3-111985 on January 12, 2018 10:23:17.27
*/
gx.evt.autoSkip=!1;gx.define("viewdetentradamercancia",!1,function(){var n,t;this.ServerClass="viewdetentradamercancia";this.PackageName="com.wms";this.setObjectType("web");this.hasEnterEvent=!1;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){this.AV11LoadAllTabs=gx.fn.getControlValue("vLOADALLTABS");this.AV7SelectedTabCode=gx.fn.getControlValue("vSELECTEDTABCODE");this.AV12CabEntradaMercanciaId=gx.fn.getIntegerValue("vCABENTRADAMERCANCIAID",".");this.AV6TabCode=gx.fn.getControlValue("vTABCODE")};this.s112_client=function(){(this.AV11LoadAllTabs||this.AV7SelectedTabCode==""||this.AV7SelectedTabCode=="General")&&this.createWebComponent("Generalwc","DetEntradaMercanciaGeneral",[this.AV12CabEntradaMercanciaId])};this.e130i1_client=function(){this.clearMessages();this.AV7SelectedTabCode=this.TABContainer.ActivePageControlName;this.AV11LoadAllTabs=!1;this.s112_client();this.refreshOutputs([{av:"AV7SelectedTabCode",fld:"vSELECTEDTABCODE",pic:"",nv:""},{av:"AV11LoadAllTabs",fld:"vLOADALLTABS",pic:"",nv:!1},{ctrl:"GENERALWC"}])};this.e140i2_client=function(){this.executeServerEvent("ENTER",!0,null,!1,!1)};this.e150i2_client=function(){this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,23,24,26,27,28];this.GXLastCtrlId=28;this.TABContainer=gx.uc.getNew(this,21,18,"Tab","TABContainer","Tab","TAB");t=this.TABContainer;t.setProp("Enabled","Enabled",!0,"boolean");t.setProp("ActivePage","Activepage","","int");t.setDynProp("ActivePageControlName","Activepagecontrolname","","char");t.setProp("PageCount","Pagecount",1,"num");t.setProp("Class","Class","WWTab","str");t.setProp("HistoryManagement","Historymanagement",!0,"bool");t.setProp("Visible","Visible",!0,"bool");t.setC2ShowFunction(function(n){n.show()});t.addEventHandler("TabChanged",this.e130i1_client);this.setUserControl(t);n[2]={fld:"",grid:0};n[3]={fld:"MAINTABLE",grid:0};n[4]={fld:"",grid:0};n[5]={fld:"",grid:0};n[6]={fld:"TABLETOP",grid:0};n[7]={fld:"",grid:0};n[8]={fld:"",grid:0};n[9]={fld:"VIEWTITLE",format:0,grid:0};n[10]={fld:"",grid:0};n[11]={fld:"VIEWALL",format:0,grid:0};n[12]={fld:"",grid:0};n[13]={fld:"",grid:0};n[14]={fld:"TABTABLE_1",grid:0};n[15]={fld:"",grid:0};n[16]={fld:"",grid:0};n[17]={fld:"",grid:0};n[18]={lvl:0,type:"int",len:9,dec:0,sign:!1,pic:"ZZZZZZZZ9",ro:1,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"OCDOCENTRY",gxz:"Z1OcDocEntry",gxold:"O1OcDocEntry",gxvar:"A1OcDocEntry",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A1OcDocEntry=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z1OcDocEntry=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("OCDOCENTRY",gx.O.A1OcDocEntry,0)},c2v:function(){this.val()!==undefined&&(gx.O.A1OcDocEntry=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("OCDOCENTRY",".")},nac:gx.falseFn};n[19]={fld:"",grid:0};n[20]={fld:"",grid:0};n[23]={fld:"GENERAL_TITLE",format:0,grid:0};n[24]={fld:"",grid:0};n[26]={fld:"TABLEGENERAL",grid:0};n[27]={fld:"",grid:0};n[28]={fld:"",grid:0};this.A1OcDocEntry=0;this.Z1OcDocEntry=0;this.O1OcDocEntry=0;this.A1OcDocEntry=0;this.AV12CabEntradaMercanciaId=0;this.AV6TabCode="";this.A24CabEntradaMercanciaId=0;this.AV11LoadAllTabs=!1;this.AV7SelectedTabCode="";this.Events={e140i2_client:["ENTER",!0],e150i2_client:["CANCEL",!0],e130i1_client:["TAB.TABCHANGED",!1]};this.EvtParms.REFRESH=[[],[]];this.EvtParms.START=[[{av:"AV15Pgmname",fld:"vPGMNAME",pic:"",nv:""},{av:"A24CabEntradaMercanciaId",fld:"CABENTRADAMERCANCIAID",pic:"ZZZZZ9",nv:0},{av:"AV12CabEntradaMercanciaId",fld:"vCABENTRADAMERCANCIAID",pic:"ZZZZZ9",hsh:!0,nv:0},{av:"A1OcDocEntry",fld:"OCDOCENTRY",pic:"ZZZZZZZZ9",hsh:!0,nv:0},{av:"AV6TabCode",fld:"vTABCODE",pic:"",hsh:!0,nv:""},{av:"AV11LoadAllTabs",fld:"vLOADALLTABS",pic:"",nv:!1},{av:"AV7SelectedTabCode",fld:"vSELECTEDTABCODE",pic:"",nv:""}],[{ctrl:"FORM",prop:"Caption"},{av:'gx.fn.getCtrlProperty("VIEWALL","Link")',ctrl:"VIEWALL",prop:"Link"},{av:'gx.fn.getCtrlProperty("VIEWALL","Visible")',ctrl:"VIEWALL",prop:"Visible"},{av:"AV11LoadAllTabs",fld:"vLOADALLTABS",pic:"",nv:!1},{av:"AV7SelectedTabCode",fld:"vSELECTEDTABCODE",pic:"",nv:""},{av:"this.TABContainer.ActivePageControlName",ctrl:"TAB",prop:"ActivePageControlName"},{ctrl:"GENERALWC"}]];this.EvtParms["TAB.TABCHANGED"]=[[{av:"this.TABContainer.ActivePageControlName",ctrl:"TAB",prop:"ActivePageControlName"},{av:"AV11LoadAllTabs",fld:"vLOADALLTABS",pic:"",nv:!1},{av:"AV7SelectedTabCode",fld:"vSELECTEDTABCODE",pic:"",nv:""},{av:"AV12CabEntradaMercanciaId",fld:"vCABENTRADAMERCANCIAID",pic:"ZZZZZ9",hsh:!0,nv:0}],[{av:"AV7SelectedTabCode",fld:"vSELECTEDTABCODE",pic:"",nv:""},{av:"AV11LoadAllTabs",fld:"vLOADALLTABS",pic:"",nv:!1},{ctrl:"GENERALWC"}]];this.setVCMap("AV11LoadAllTabs","vLOADALLTABS",0,"boolean");this.setVCMap("AV7SelectedTabCode","vSELECTEDTABCODE",0,"char");this.setVCMap("AV12CabEntradaMercanciaId","vCABENTRADAMERCANCIAID",0,"int");this.setVCMap("AV6TabCode","vTABCODE",0,"char");this.Initialize();this.setComponent({id:"GENERALWC",GXClass:null,Prefix:"W0029",lvl:1})});gx.createParentObj(viewdetentradamercancia)