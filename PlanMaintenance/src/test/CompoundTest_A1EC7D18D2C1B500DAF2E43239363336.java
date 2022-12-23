/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import java.util.HashMap;

@SuppressWarnings("all")
public class CompoundTest_A1EC7D18D2C1B500DAF2E43239363336
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_A1EC7D18D2C1B500DAF2E43239363336(IContainer parent, String name) {
		super(parent, "Non-Emergency_Notification", "A1EC7D18D2C1B500DAF2E43239363336");
	}

	public void execute() {

		this.add(
				new test.SAP_GUI_Login_Test_A1EC7D1006B8FCFDC233B56263303031(this, "A1EC7D18F3CFED20DAF2E43239363336") {
					public void execute() {
						this.setRtbEnabled(false);
						super.execute();
					}
				});

		this.add(new test.Test_A1EC7D104F046E47C233B56263303031(this, "A1EC7D18F71DB890DAF2E43239363336") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.IW22_Change_Non_emergency_Notification_Test_A1EC7D1086C75CE5C233B56263303031(this,
				"A1EC7D190C128F00DAF2E43239363336") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.IW32_Change_Maintenance_Order_Test_A1EC7D10DFCB42C8C233B56263303031(this,
				"A1EC7D19219303A0DAF2E43239363336") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.IW41_Confirm_time_WO_Test_A1EC7D11D74B60A5C233B56263303031(this,
				"A1EC7D873F3AAE30ED32E66333346434") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.IW32_TECO_WO_Test_A1EC7F25AE4D45E0D03EE13836386131(this, "A1EC7F294EB193D0D03EE13836386131") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.SAP_GUI_Logout_Test_A1EC7F1F5835DADCD03EE13836386131(this,
				"A1EC7F201BD61A20D03EE13836386131") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}