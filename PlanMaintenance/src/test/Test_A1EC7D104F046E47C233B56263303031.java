/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM and/or HCL
* Copyright IBM Corporation 2013, 2017. All Rights Reserved.
* Copyright HCL Technologies Ltd. 2017, 2020.  All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.hcl.onetest.ui.sap.rtw.execution.SapUnifiedReport;
import com.ibm.bridge2java.COMconstants;
import com.ibm.bridge2java.Jvariant;
import com.ibm.rational.test.lt.datacorrelation.datapoolAction.Datapool;
import com.ibm.rational.test.lt.datacorrelation.datapoolAction.DatapoolAction;
import com.ibm.rational.test.lt.datacorrelation.execution.action.AssignVariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.execution.core.impl.ArmableTransaction;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKAction;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import com.ibm.rational.test.lt.runtime.sap.execution.impl.SAPArmableScreen;
import com.ibm.rational.test.lt.runtime.sap.execution.impl.SAPCommand;
import com.ibm.rational.test.lt.runtime.sap.execution.impl.SAPCommandType;
import com.ibm.rational.test.lt.runtime.sap.execution.impl.SAPEvent;
import com.ibm.rational.test.lt.runtime.sap.execution.impl.SAPScreen;
import com.ibm.rational.test.lt.runtime.sap.execution.impl.SAPShowOption;
import com.ibm.rational.test.lt.runtime.sap.execution.impl.SAPTestScriptHelper;
import com.ibm.rational.test.lt.runtime.sap.execution.impl.SAPThink;

@SuppressWarnings("all")
public class Test_A1EC7D104F046E47C233B56263303031 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.runtime.sap.execution.impl.SAPDataAdapter", "com.ibm.rational.test.lt.runtime.sap.execution.impl.JCOArmableExecution");
pa.addPA("com.ibm.rational.test.lt.runtime.sap.execution.impl.SAPDataAdapter", "com.ibm.rational.test.lt.runtime.sap.execution.impl.JCOConnection");
pa.addPA("com.ibm.rational.test.lt.runtime.sap.execution.impl.SAPDataAdapter", "com.ibm.rational.test.lt.runtime.sap.execution.impl.SAPConnection");
pa.addPA("com.ibm.rational.test.lt.runtime.sap.execution.impl.SAPDataAdapter", "com.ibm.rational.test.lt.runtime.sap.execution.impl.SAPCommand");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(3);
	private DataVar[] vars = new DataVar[2];
	
    
    private SAPTestScriptHelper sapTestScriptHelper;

	SAPTestScriptHelper getSAPTest() {
		return sapTestScriptHelper;
	}

	
	public Test_A1EC7D104F046E47C233B56263303031(IContainer container, String invocationId) {
		super(container, "IW21_Create_Non-emergency_notification", invocationId, "A1EC7D104F046E47C233B56263303031");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		this.sapTestScriptHelper = new SAPTestScriptHelper(this);
		this.sapTestScriptHelper.sapShowOption = SAPShowOption.SHOW_ALL;
		this.sapTestScriptHelper.sapKeepScreenOption = true;
		this.sapTestScriptHelper.testPath = "/PlanMaintenance/Tests/IW21_Create_Non-emergency_notification.testsuite";
		this.sapTestScriptHelper.testlogRtwMode = !isScheduleRun() && true;
		this.sapTestScriptHelper.scriptGUID = "A1EC7D104F046E47C233B56263303031";
	}

    public void execute() {
    	try {
			if (SAPTestScriptHelper.isSapGuiInstalled()) {

	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun()){
this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	}
	
	
	        	this.add(datapool_1(this));
	this.add(varAction_1(this));
	this.add(transaction_1(this));
			}
this.sapTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: Test_A1EC7D104F046E47C233B56263303031 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		
		super.preFinish();
	}
	
	public void stop() {
		this.sapTestScriptHelper.stopHelper();

		super.stop();
	}	
	
	
	private DatapoolAction datapool_1(IContainer parent) {
		DatapoolAction dpAction = new DatapoolAction(parent, "PlanMaintenance.csv", "A1EC7F8A65C75760C041E56237393865", false);
		Datapool dp = new Datapool(
				 "/L1BsYW5NYWludGVuYW5jZS9QbGFuTWFpbnRlbmFuY2UuY3N2.csv",
				 "C:\\HCLSW\\Workspace\\Mosaic\\PlanMaintenance\\PlanMaintenance.csv",
				 0,
				 true,
				 false,
				 Datapool.SEQUENTIAL,
				 null, 0, false, getVirtualUserName());
		dp.addHarvestInstruction("Notification Description", dcVars[0], false);
dp.addHarvestInstruction("Equipment", dcVars[1], false);
		dpAction.setDatapool(dp, true);
		return dpAction;
	}

private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1EC7CD6922ED0F0C3E0B73361363133");	
			vars[0] = new DataVar("PM_Number", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[1] = new DataVar("PM_Notification", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}

	private ArmableTransaction transaction_1(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "1 / IW22", "A1EC7CD6A49FE2B0C3E0B73361363133") {
		
		    public void execute() {     
		       	
	
	
	
	      
                
	if (!isScheduleRun()) {
		SAPTestScriptHelper.setUnifiedReport(SapUnifiedReport.getInstance(getSAPTest().containerScript, getSAPTest().testPath, "com-hcl-onetest-ui-sap-rtw-sapgui-application"));
	}

	this.add(SapScreen_1(this));
	this.add(SapScreen_2(this));
	this.add(SapScreen_3(this));
	this.add(SapScreen_4(this));
	this.add(SapScreen_5(this));

		     
                super.execute();
            }
        
            public void finish(IKAction child) {
                super.finish(child);
                if (hasFinished()) {
                    
                }
            }
		};
		trx.setArmEnabled(false);
		trx.setIgnoreUnhealthy(false);
		return trx;
	}


	public SAPScreen SapScreen_1(IContainer parent) {
		SAPScreen sapScreen = new SAPArmableScreen(parent, "SAP Easy Access / IW21", "A1EC7CD6A49FE2B3C3E0B73361363133", false, false, this.sapTestScriptHelper.sapKeepScreenOption);
	sapScreen.add(SapEvent_1(sapScreen));
	sapScreen.add(SapEvent_2(sapScreen));
		sapScreen.add(new SAPCommand(sapScreen, "Server Request", "A1EC7CD6A4B58D90C3E0B73361363133", SAPCommandType.CMD_REQUEST, "request", false, null,  null, false, 180000));

		return sapScreen;
	}

	public SAPEvent SapEvent_1(IContainer parent) {
		SAPEvent sapEvent = new SAPEvent(parent, "Set \"GuiOkCodeField\" text to \"/NIW21\"", "GuiOkCodeField", "A1EC7CD6A4B47C20C3E0B73361363133", "wnd[0]/tbar[0]/okcd", false, false);
		sapEvent.add(new SAPThink(sapEvent, "Think Time", "TT-A1EC7CD6A4B47C30C3E0B73361363133", 4719));
		sapEvent.add(new SAPCommand(sapEvent, "Set \"GuiOkCodeField\" text to \"/NIW21\"", "A1EC7CD6A4B47C30C3E0B73361363133", SAPCommandType.CMD_SET_PROPERTY_1, "text", false, new Jvariant[]{new Jvariant("/NIW21",COMconstants.VT_BSTR)},  null, false, 180000));

		return sapEvent;
	}

	public SAPEvent SapEvent_2(IContainer parent) {
		SAPEvent sapEvent = new SAPEvent(parent, "Press \"Enter\"", "GuiButton", "A1EC7CD6A4B4F150C3E0B73361363133", "wnd[0]/tbar[0]/btn[0]", false, false);
		sapEvent.add(new SAPThink(sapEvent, "Think Time", "TT-A1EC7CD6A4B4F159C3E0B73361363133", 4719));
		sapEvent.add(new SAPCommand(sapEvent, "Press \"Enter\"", "A1EC7CD6A4B4F159C3E0B73361363133", SAPCommandType.CMD_CALL_METHOD_1, "press", false, null,  null, false, 180000));

		return sapEvent;
	}

	public SAPScreen SapScreen_2(IContainer parent) {
		SAPScreen sapScreen = new SAPArmableScreen(parent, "Create PM Notification: Initial Screen / IW21", "A1EC7CD6A4C98AC0C3E0B73361363133", false, false, this.sapTestScriptHelper.sapKeepScreenOption);
	sapScreen.add(SapEvent_3(sapScreen));
	sapScreen.add(SapEvent_4(sapScreen));
		sapScreen.add(new SAPCommand(sapScreen, "Server Request", "A1EC7CD6A4DE9960C3E0B73361363133", SAPCommandType.CMD_REQUEST, "request", false, null,  null, false, 180000));

		return sapScreen;
	}

	public SAPEvent SapEvent_3(IContainer parent) {
		SAPEvent sapEvent = new SAPEvent(parent, "Set \"Notification Type\" text to \"M1\"", "GuiCTextField", "A1EC7CD6A4DD60E0C3E0B73361363133", "wnd[0]/usr/ctxtRIWO00-QMART", false, false);
		sapEvent.add(new SAPThink(sapEvent, "Think Time", "TT-A1EC7CD6A4DD60F0C3E0B73361363133", 3851));
		sapEvent.add(new SAPCommand(sapEvent, "Set \"Notification Type\" text to \"M1\"", "A1EC7CD6A4DD60F0C3E0B73361363133", SAPCommandType.CMD_SET_PROPERTY_1, "text", false, new Jvariant[]{new Jvariant("M1",COMconstants.VT_BSTR)},  null, false, 180000));

		return sapEvent;
	}

	public SAPEvent SapEvent_4(IContainer parent) {
		SAPEvent sapEvent = new SAPEvent(parent, "Press \"Enter\"", "GuiButton", "A1EC7CD6A4DE2430C3E0B73361363133", "wnd[0]/tbar[0]/btn[0]", false, false);
		sapEvent.add(new SAPThink(sapEvent, "Think Time", "TT-A1EC7CD6A4DE4B40C3E0B73361363133", 3849));
		sapEvent.add(new SAPCommand(sapEvent, "Press \"Enter\"", "A1EC7CD6A4DE4B40C3E0B73361363133", SAPCommandType.CMD_CALL_METHOD_1, "press", false, null,  null, false, 180000));

		return sapEvent;
	}

	public SAPScreen SapScreen_3(IContainer parent) {
		SAPScreen sapScreen = new SAPArmableScreen(parent, "Create PM Notification: Maintenance Request / IW21", "A1EC7CD6A4DEC070C3E0B73361363133", false, false, this.sapTestScriptHelper.sapKeepScreenOption);
	sapScreen.add(SapEvent_5(sapScreen));
	sapScreen.add(SapEvent_6(sapScreen));
	sapScreen.add(SapEvent_7(sapScreen));
	sapScreen.add(SapEvent_8(sapScreen));
	sapScreen.add(SapEvent_9(sapScreen));
	sapScreen.add(SapEvent_10(sapScreen));
		sapScreen.add(new SAPCommand(sapScreen, "Server Request", "A1EC7CD6A5000410C3E0B73361363133", SAPCommandType.CMD_REQUEST, "request", false, null,  null, false, 180000));

		return sapScreen;
	}

	public SAPEvent SapEvent_5(IContainer parent) {
		SAPEvent sapEvent = new SAPEvent(parent, "Set \"GuiShell\" text to \"\"", "GuiShell", "A1EC7CD6A4FD1DE0C3E0B73361363133", "wnd[0]/usr/tabsTAB_GROUP_10/tabp10\\TAB01/ssubSUB_GROUP_10:SAPLIQS0:7235/subCUSTOM_SCREEN:SAPLIQS0:7212/subSUBSCREEN_2:SAPLIQS0:7715/cntlTEXT/shellcont/shell", false, false);
		sapEvent.add(new SAPThink(sapEvent, "Think Time", "TT-A1EC7CD6A4FD1DF0C3E0B73361363133", 12602));
		sapEvent.add(new SAPCommand(sapEvent, "Set \"GuiShell\" text to \"\"", "A1EC7CD6A4FD1DF0C3E0B73361363133", SAPCommandType.CMD_SET_PROPERTY_1, "text", false, new Jvariant[]{new Jvariant("",COMconstants.VT_BSTR)},  null, false, 180000));

		return sapEvent;
	}

	public SAPEvent SapEvent_6(IContainer parent) {
		SAPEvent sapEvent = new SAPEvent(parent, "Call setSelectionIndexes on \"SAP.TableTreeControl.1\"", "GuiShell", "A1EC7CD6A4FD9310C3E0B73361363133", "wnd[0]/usr/tabsTAB_GROUP_10/tabp10\\TAB01/ssubSUB_GROUP_10:SAPLIQS0:7235/subCUSTOM_SCREEN:SAPLIQS0:7212/subSUBSCREEN_2:SAPLIQS0:7715/cntlTEXT/shellcont/shell", false, false);
		sapEvent.add(new SAPThink(sapEvent, "Think Time", "TT-A1EC7CD6A4FD9319C3E0B73361363133", 12602));
		sapEvent.add(new SAPCommand(sapEvent, "Call setSelectionIndexes on \"SAP.TableTreeControl.1\"", "A1EC7CD6A4FD9319C3E0B73361363133", SAPCommandType.CMD_CALL_METHOD_1, "setSelectionIndexes", false, null,  null, false, 180000));

		return sapEvent;
	}

	public SAPEvent SapEvent_7(IContainer parent) {
		SAPEvent sapEvent = new SAPEvent(parent, "Set \"%00000000001\" text to \"Non emergency notification for NM\"", "GuiTextField", "A1EC7CD6A4FE0840C3E0B73361363133", "wnd[0]/usr/subSCREEN_1:SAPLIQS0:1050/subNOTIF_TYPE:SAPLIQS0:1051/txtVIQMEL-QMTXT", false, false);
		sapEvent.add(new SAPThink(sapEvent, "Think Time", "TT-A1EC7CD6A4FE2F50C3E0B73361363133", 12602));
	sapEvent.add(SapCommand_1(sapEvent));
		return sapEvent;
	}

	public SAPCommand SapCommand_1(IContainer parent) {
		SAPCommand sapCommand = new SAPCommand(parent, "Set \"%00000000001\" text to \"Non emergency notification for NM\"", "A1EC7CD6A4FE2F50C3E0B73361363133", SAPCommandType.CMD_SET_PROPERTY_1, "text", false, new Jvariant[]{new Jvariant("Non emergency notification for NM",COMconstants.VT_BSTR)}, null, false, 180000);
		IDataSub subContainer_1 = new DataSub();
		sapCommand.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("0", 0, 33, false, (IDCCoreVar)dcVars[0], false, "Non emergency notification for NM", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	
		return sapCommand;
	}


	public SAPEvent SapEvent_8(IContainer parent) {
		SAPEvent sapEvent = new SAPEvent(parent, "Set \"Equipment\" text to \"217100091\"", "GuiCTextField", "A1EC7CD6A4FEA480C3E0B73361363133", "wnd[0]/usr/tabsTAB_GROUP_10/tabp10\\TAB01/ssubSUB_GROUP_10:SAPLIQS0:7235/subCUSTOM_SCREEN:SAPLIQS0:7212/subSUBSCREEN_1:SAPLIQS0:7322/subOBJEKT:SAPLIWO1:0100/ctxtRIWO1-EQUNR", false, false);
		sapEvent.add(new SAPThink(sapEvent, "Think Time", "TT-A1EC7CD6A4FEA490C3E0B73361363133", 12602));
	sapEvent.add(SapCommand_2(sapEvent));
		return sapEvent;
	}

	public SAPCommand SapCommand_2(IContainer parent) {
		SAPCommand sapCommand = new SAPCommand(parent, "Set \"Equipment\" text to \"217100091\"", "A1EC7CD6A4FEA490C3E0B73361363133", SAPCommandType.CMD_SET_PROPERTY_1, "text", false, new Jvariant[]{new Jvariant("217100091",COMconstants.VT_BSTR)}, null, false, 180000);
		IDataSub subContainer_2 = new DataSub();
		sapCommand.addDataSub(subContainer_2);
	ISubRule sub_1 = new SubRule("0", 0, 9, false, (IDCCoreVar)dcVars[1], false, "Equipment", null, 0, false);
	subContainer_2.addSubInstruction(sub_1);
	
		return sapCommand;
	}


	public SAPEvent SapEvent_9(IContainer parent) {
		SAPEvent sapEvent = new SAPEvent(parent, "Set focus on \"Equipment\"", "GuiCTextField", "A1EC7CD6A4FEF2A0C3E0B73361363133", "wnd[0]/usr/tabsTAB_GROUP_10/tabp10\\TAB01/ssubSUB_GROUP_10:SAPLIQS0:7235/subCUSTOM_SCREEN:SAPLIQS0:7212/subSUBSCREEN_1:SAPLIQS0:7322/subOBJEKT:SAPLIWO1:0100/ctxtRIWO1-EQUNR", false, false);
		sapEvent.add(new SAPThink(sapEvent, "Think Time", "TT-A1EC7CD6A4FEF2A9C3E0B73361363133", 12602));
		sapEvent.add(new SAPCommand(sapEvent, "Set focus on \"Equipment\"", "A1EC7CD6A4FEF2A9C3E0B73361363133", SAPCommandType.CMD_CALL_METHOD_1, "setFocus", false, null,  null, false, 180000));

		return sapEvent;
	}

	public SAPEvent SapEvent_10(IContainer parent) {
		SAPEvent sapEvent = new SAPEvent(parent, "Press \"Enter\"", "GuiButton", "A1EC7CD6A4FFB5F0C3E0B73361363133", "wnd[0]/tbar[0]/btn[0]", false, false);
		sapEvent.add(new SAPThink(sapEvent, "Think Time", "TT-A1EC7CD6A4FFB5F9C3E0B73361363133", 12602));
		sapEvent.add(new SAPCommand(sapEvent, "Press \"Enter\"", "A1EC7CD6A4FFB5F9C3E0B73361363133", SAPCommandType.CMD_CALL_METHOD_1, "press", false, null,  null, false, 180000));

		return sapEvent;
	}

	public SAPScreen SapScreen_4(IContainer parent) {
		SAPScreen sapScreen = new SAPArmableScreen(parent, "Create PM Notification: Maintenance Request / IW21", "A1EC7CD6A54104B1C3E0B73361363133", false, false, this.sapTestScriptHelper.sapKeepScreenOption);
	sapScreen.add(SapEvent_11(sapScreen));
		sapScreen.add(new SAPCommand(sapScreen, "Server Request", "A1EC7CD6A56CA890C3E0B73361363133", SAPCommandType.CMD_REQUEST, "request", false, null,  null, false, 180000));

		return sapScreen;
	}

	public SAPEvent SapEvent_11(IContainer parent) {
		SAPEvent sapEvent = new SAPEvent(parent, "Press \"Save   (Ctrl+S)\"", "GuiButton", "A1EC7CD6A56C5A70C3E0B73361363133", "wnd[0]/tbar[0]/btn[11]", false, false);
		sapEvent.add(new SAPThink(sapEvent, "Think Time", "TT-A1EC7CD6A56C5A79C3E0B73361363133", 5359));
		sapEvent.add(new SAPCommand(sapEvent, "Press \"Save   (Ctrl+S)\"", "A1EC7CD6A56C5A79C3E0B73361363133", SAPCommandType.CMD_CALL_METHOD_1, "press", false, null,  null, false, 180000));

		return sapEvent;
	}

	public SAPScreen SapScreen_5(IContainer parent) {
		SAPScreen sapScreen = new SAPArmableScreen(parent, "Create PM Notification: Initial Screen / IW21", "A1EC7CD6A56CCFA0C3E0B73361363133", false, false, this.sapTestScriptHelper.sapKeepScreenOption);
	sapScreen.add(SapEvent_12(sapScreen));
	sapScreen.add(dataVarAssign_1(sapScreen));
	sapScreen.add(SapEvent_13(sapScreen));
		sapScreen.add(new SAPCommand(sapScreen, "Server Request", "A1EC7CD6A57A3D20C3E0B73361363133", SAPCommandType.CMD_REQUEST, "request", false, null,  null, false, 180000));

		return sapScreen;
	}

	public SAPEvent SapEvent_12(IContainer parent) {
		SAPEvent sapEvent = new SAPEvent(parent, "Get \"GuiStatusbar\" text recorded as \"Notification 10000131 saved\"", "GuiStatusbar", "A1EC7CDF75C070A0F77FB76131336165", "wnd[0]/sbar", false, false);
		sapEvent.add(new SAPThink(sapEvent, "Think Time", "TT-A1EC7CDF75C2E1A0F77FB76131336165", 0));
	sapEvent.add(SapCommand_3(sapEvent));
		return sapEvent;
	}

	public SAPCommand SapCommand_3(IContainer parent) {
		SAPCommand sapCommand = new SAPCommand(parent, "Get \"GuiStatusbar\" text recorded as \"Notification 10000131 saved\"", "A1EC7CDF75C2E1A0F77FB76131336165", SAPCommandType.CMD_GET_PROPERTY_1, "Text", false, null, null, false, 180000);
		IDataHarvester dataSource_1 = new DataHarvester();
		sapCommand.addDataHarvester(dataSource_1);
	dataSource_1.addHarvestInstruction ("ret", dcVars[2], "^Notification (.*?) ", 1, 0, 0, 0, false, "PMNumber", null, 0, false);
		return sapCommand;
	}


private AssignVariableAction dataVarAssign_1(final IContainer parent) {
	AssignVariableAction varAction = new AssignVariableAction(parent, "A1EC7CDF90322780F77FB76131336165");

	varAction.add(vars[0] , dcVars[2]);

	return varAction;
}

	public SAPEvent SapEvent_13(IContainer parent) {
		SAPEvent sapEvent = new SAPEvent(parent, "Call doubleClick on \"Notification 10000131 saved\"", "GuiStatusbar", "A1EC7CD6A579EF00C3E0B73361363133", "wnd[0]/sbar", false, false);
		sapEvent.add(new SAPThink(sapEvent, "Think Time", "TT-A1EC7CD6A579EF09C3E0B73361363133", 3572));
		sapEvent.add(new SAPCommand(sapEvent, "Call doubleClick on \"Notification 10000131 saved\"", "A1EC7CD6A579EF09C3E0B73361363133", SAPCommandType.CMD_CALL_METHOD_1, "doubleClick", false, null,  null, false, 180000));

		return sapEvent;
	}
}
