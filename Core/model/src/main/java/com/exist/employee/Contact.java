package com.exist.employee;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.GeneratedValue;
import javax.persistence.FetchType;
@Entity
@Table(name = "contacts")
public class Contact {
	
	@Id
	@Column(name="employeeid")
	@GeneratedValue(generator="gen")
	@GenericGenerator(name="gen", strategy="foreign", 
		parameters={@Parameter(name = "property", value="employee")})
	private long employeeId;
	
	@OneToOne(fetch = FetchType.EAGER)
	@PrimaryKeyJoinColumn
	private Employee employee;
	private String landline;
	private String mobile;
	private String email;
	
	public long getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
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

        Contact add2 = (Contact) obj;

         return this.landline.equals(add2.getLandline()) && 
         		this.mobile.equals(add2.getMobile()) && this.email.equals(add2.getEmail());
        
   }

   @Override
   public int hashCode() {
        return java.util.Objects.hash(landline,mobile,email);
    }

}