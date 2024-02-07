class Admin extends User
{
    private String adminId;
    public String getAdminId() {
        return adminId;
    }
    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }
   public Admin()
    {
        super();
        System.out.println("Enter your admin id");
        this.adminId = scanObj1.nextLine();
    }

 
      
}