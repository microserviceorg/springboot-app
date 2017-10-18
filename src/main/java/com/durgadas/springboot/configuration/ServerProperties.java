package com.durgadas.springboot.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("server")
public class ServerProperties {
	private String email;
    private List<Cluster> cluster = new ArrayList<>();
    
    public static class Cluster {
        private String ip;
        private String port;

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getPort() {
            return port;
        }

        public void setPort(String port) {
            this.port = port;
        }

        @Override
        public String toString() {
            return "Cluster{" +
                    "ip='" + ip + '\'' +
                    ", port='" + port + '\'' +
                    '}';
        }
    }
    
    public String getEmail() {
		return email;
	}
    
    public void setEmail(String email) {
		this.email = email;
	}
    
    public List<Cluster> getCluster() {
		return cluster;
	}
    
    public void setCluster(List<Cluster> cluster) {
		this.cluster = cluster;
	}
    
    @Override
    public String toString() {
        return "ServerProperties{" +
                "email='" + email + '\'' +
                ", cluster=" + cluster +
                '}';
    }
}
