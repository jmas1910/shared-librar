def call() {
 def now = new Date()
	echo now.format("yyMMdd.HHmm", TimeZone.getTimeZone('UTC'))
	
	Calendar calendar = Calendar.getInstance();
	day = now[calendar.DAY_OF_WEEK]
