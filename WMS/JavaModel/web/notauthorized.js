/*!   GeneXus Java 15_0_3-111985 on January 12, 2018 10:23:15.50
*/
gx.evt.autoSkip=!1;gx.define("notauthorized",!1,function(){this.ServerClass="notauthorized";this.PackageName="com.wms";this.setObjectType("web");this.hasEnterEvent=!1;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){this.GxObject=gx.fn.getControlValue("vGXOBJECT")};this.e13072_client=function(){this.executeServerEvent("ENTER",!0,null,!1,!1)};this.e14072_client=function(){this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];var n=this.GXValidFnc;this.GXCtrlIds=[4,7,13,16];this.GXLastCtrlId=16;n[4]={fld:"TABLE1",grid:0};n[7]={fld:"TITLETEXT",format:0,grid:0};n[13]={fld:"TABLE2",grid:0};n[16]={fld:"TABLE3",grid:0};this.GxObject="";this.Events={e13072_client:["ENTER",!0],e14072_client:["CANCEL",!0]};this.EvtParms.REFRESH=[[],[]];this.EvtParms.START=[[{av:"AV8Pgmname",fld:"vPGMNAME",pic:"",nv:""}],[{ctrl:"RECENTLINKS"}]];this.setVCMap("GxObject","vGXOBJECT",0,"svchar");this.Initialize();this.setComponent({id:"HEADERBC",GXClass:null,Prefix:"W0002",lvl:1});this.setComponent({id:"RECENTLINKS",GXClass:null,Prefix:"W0003",lvl:1})});gx.createParentObj(notauthorized)