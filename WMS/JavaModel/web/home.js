/*!   GeneXus Java 15_0_3-111985 on January 12, 2018 10:23:15.87
*/
gx.evt.autoSkip=!1;gx.define("home",!1,function(){var t,n;this.ServerClass="home";this.PackageName="com.wms";this.setObjectType("web");this.hasEnterEvent=!1;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){};this.e12082_client=function(){this.executeServerEvent("ENTER",!0,arguments[0],!1,!1)};this.e13082_client=function(){this.executeServerEvent("CANCEL",!0,arguments[0],!1,!1)};this.GXValidFnc=[];t=this.GXValidFnc;this.GXCtrlIds=[2,8];this.GXLastCtrlId=8;this.Grid1Container=new gx.grid.grid(this,2,"WbpLvl2",5,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"home",[],!0,1,!0,!0,0,!1,!1,!1,"",100,"%","Nueva fila",!1,!1,!1,null,null,!1,"",!1,[1,1,1,1],!1,0,!1,!1);n=this.Grid1Container;n.startRow("","","","","","");n.startCell("","","","","","","","","","");n.addSingleLineEdit("Menuitem",8,"vMENUITEM","","","MenuItem","char",80,"chr",100,80,"left",null,[],"Menuitem","MenuItem",!0,0,!1,!1,"Attribute",1,"");n.endCell();n.endRow();this.Grid1Container.emptyText="";this.setGrid(n);t[2]={fld:"TABLE1",grid:0};t[8]={lvl:2,type:"char",len:100,dec:0,sign:!1,ro:1,isacc:0,grid:5,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vMENUITEM",gxz:"ZV5MenuItem",gxold:"OV5MenuItem",gxvar:"AV5MenuItem",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){n!==undefined&&(gx.O.AV5MenuItem=n)},v2z:function(n){n!==undefined&&(gx.O.ZV5MenuItem=n)},v2c:function(n){gx.fn.setGridControlValue("vMENUITEM",n||gx.fn.currentGridRowImpl(5),gx.O.AV5MenuItem,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV5MenuItem=this.val())},val:function(n){return gx.fn.getGridControlValue("vMENUITEM",n||gx.fn.currentGridRowImpl(5))},nac:gx.falseFn};this.AV5MenuItem="";this.Events={e12082_client:["ENTER",!0],e13082_client:["CANCEL",!0]};this.EvtParms.REFRESH=[[{av:"GRID1_nFirstRecordOnPage",nv:0},{av:"GRID1_nEOF",nv:0}],[]];this.EvtParms.LOAD=[[],[{av:"AV5MenuItem",fld:"vMENUITEM",pic:"",nv:""},{av:'gx.fn.getCtrlProperty("vMENUITEM","Link")',ctrl:"vMENUITEM",prop:"Link"}]];this.Initialize()});gx.createParentObj(home)