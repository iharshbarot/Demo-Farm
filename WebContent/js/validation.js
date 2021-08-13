function registration()
{
	if(f1.farm_name.value=="")
	{
		alert("Please Enter Farm Name");
		f1.farm_name.focus();
		return false;
	}
	if(f1.farm_address.value=="")
	{
		alert("Please Select Farm Address");
		f1.farm_address.focus();
		return false;
	}
	
	if(f1.district.value=="")
	{
		alert("Please Enter Fram District");
		f1.district.focus();
		return false;
	}
	if(f1.state.value=="")
	{
		alert("Please Enter Fram State");
		f1.state.focus();
		return false;
	}
	if(f1.farm_email.value=="")
	{
		alert("Please Enter Fram Email Address");
		f1.farm_email.focus();
		return false;
	}
	if(f1.farm_phone_no.value=="")
	{
		alert("Please Enter Farm Phone Number");
		f1.farm_phone_no.focus();
		return false;
	}
	if(isNaN(f1.farm_phone_no.value))
	{
		alert("Please Enter Only Digits for Mobile Number.");
		f1.farm_phone_no.focus();
		return false;
	}
	if(f1.farm_phone_no.value.length!=10)
	{
		alert("Mobile Number must be 10 digits only");
		f1.farm_phone_no.focus();
		return false;
	}
	if(f1.farm_reg_no.value=="")
	{
		alert("Please Enter Farm Registration Number");
		f1.farm_reg_no.focus();
		return false;
	}
	if(f1.owner_name.value=="")
	{
		alert("Please Enter Owner Name");
		f1.owner_name.focus();
		return false;
	}
	if(f1.owner_contact_no.value=="")
	{
		alert("Please Enter Owner Contact Number");
		f1.owner_contact_no.focus();
		return false;
	}
	if(isNaN(f1.owner_contact_no.value))
	{
		alert("Please Enter Only Digits for Mobile Number.");
		f1.owner_contact_no.focus();
		return false;
	}
	if(f1.owner_contact_no.value.length!=10)
	{
		alert("Mobile Number must be 10 digits only");
		f1.owner_contact_no.focus();
		return false;
	}
	if(f1.username.value.length="")
	{
		alert("Please Enter Username");
		f1.username.focus();
		return false;
	}
	if(f1.password.value.length="")
	{
		alert("Please Enter Your Password");
		f1.password.focus();
		return false;
	}
	if(f1.rpassword.value.length="")
	{
		alert("Please Enter Confirm password");
		f1.rpassword.focus();
		return false;
	}
	if(f1.password.value!=f1.rpassword.value)
		{
				alert("password do not a match");
				f1.password.focus();
				return false;
		}
	else
		return true;
		
}