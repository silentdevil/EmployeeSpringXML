package com.exist.employee;

public class ContactDto {
	

	private long employeeId;
	
	private EmployeeDto employee;
	private String landline;
	private String mobile;
	private String email;
	
	public long getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public EmployeeDto getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeDto employee) {
		this.employee = employee;
	}
	
	public String getLandline() {
		return landline;
	}
	
	public void setLandline(String landline) {
		this.landline = landline;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
	   StringBuffer sb = new StringBuffer();
		sb.append("Landline:  ").append(landline);
		sb.append(" Mobile: ").append(mobile);
		sb.append(" Email : ").append(email);
		return sb.toString();
	}

	@Override
   public boolean equals(Object obj) {
       if(obj == null || getClass() != obj.getClass())
         return false;

        ContactDto add2 = (ContactDto) obj;

         return this.landline.equals(add2.getLandline()) && 
         		this.mobile.equals(add2.getMobile()) && this.email.equals(add2.getEmail());
        
   }

   @Override
   public int hashCode() {
        return java.util.Objects.hash(landline,mobile,email);
    }

}