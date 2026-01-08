package com.silenthill.redbook.config;

import com.silenthill.redbook.service.HelloJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {
    @Bean
    public JobDetail helloJobDetail(){
        return JobBuilder.newJob(HelloJob.class)
                .withIdentity("DateTimeJob")
                .storeDurably()
                .build();
    }
    @Bean
    public Trigger printTimeJobTrigger(){
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0/1 * * * * ?");
        return TriggerBuilder.newTrigger()
                .forJob(helloJobDetail())
                .withIdentity("quartzTaskService")
                .withSchedule(cronScheduleBuilder)
                .build();
    }
}
