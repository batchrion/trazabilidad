/*!   GeneXus Java 15_0_3-111985 on January 5, 2018 11:41:8.79
*/
gx.evt.autoSkip=!1;gx.define("codebar",!1,function(){this.ServerClass="codebar";this.PackageName="com.wms";this.setObjectType("web");this.hasEnterEvent=!1;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){};this.e110l2_client=function(){this.executeServerEvent("'CONVERTIR'",!1,null,!1,!1)};this.e130l2_client=function(){this.executeServerEvent("ENTER",!0,null,!1,!1)};this.e140l2_client=function(){this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];var n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,9];this.GXLastCtrlId=9;n[2]={fld:"",grid:0};n[3]={fld:"MAINTABLE",grid:0};n[4]={fld:"",grid:0};n[5]={fld:"",grid:0};n[6]={fld:"SECTION1",grid:0};n[7]={fld:"",grid:0};n[8]={lvl:0,type:"char",len:24,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vPRUEBA",gxz:"ZV5prueba",gxold:"OV5prueba",gxvar:"AV5prueba",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV5prueba=n)},v2z:function(n){n!==undefined&&(gx.O.ZV5prueba=n)},v2c:function(){gx.fn.setControlValue("vPRUEBA",gx.O.AV5prueba,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV5prueba=this.val())},val:function(){return gx.fn.getControlValue("vPRUEBA")},nac:gx.falseFn};n[9]={fld:"CONVERTIR",grid:0};this.AV5prueba="";this.ZV5prueba="";this.OV5prueba="";this.AV5prueba="";this.Events={e110l2_client:["'CONVERTIR'",!0],e130l2_client:["ENTER",!0],e140l2_client:["CANCEL",!0]};this.EvtParms.REFRESH=[[],[]];this.EvtParms["'CONVERTIR'"]=[[{av:"AV5prueba",fld:"vPRUEBA",pic:"",nv:""}],[]];this.Initialize()});gx.createParentObj(codebar)