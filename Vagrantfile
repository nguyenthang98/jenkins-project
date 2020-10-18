NODE_COUNT = 3
Vagrant.configure("2") do |config|

  (1..NODE_COUNT).each do |i|

    config.vm.define "jenkin-node-#{i}" do |node|
          node.vm.box = "debian/jessie64"
        node.vm.hostname = "jenkin-node-#{i}"
        node.vm.network "private_network", ip: "192.168.100.1#{i}"
        node.vm.provider :virtualbox do |vb, override|
            vb.memory = "1024"
            vb.cpus = "1"
        end
    end

    config.vm.provision "Install Docker", type: "shell" do |s|
        s.path = "./scripts/docker.sh"
    end
  end
end
