package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {

    private final List<DnsEntry> entries = new ArrayList<>();

    public List<DnsEntry> getEntries() {
        return entries;
    }

    public void addEntry(String hostName, String hostIp) {
        validateEntry(hostName, hostIp);
        entries.add(new DnsEntry(hostName, hostIp));
    }

    public void removeEntryByName(String hostName) {
        entries.remove(getEntryByName(hostName));
    }

    public void removeEntryByIp(String hostIp) {
        entries.remove(getEntryByIp(hostIp));
    }

    public String getIpByName(String hostName) {
        DnsEntry entry = getEntryByName(hostName);
        if (entry != null) { return entry.hostIp; }
        throw new IllegalArgumentException("Entry not found");
    }

    public String getNameByIp(String hostIp) {
        DnsEntry entry = getEntryByIp(hostIp);
        if (entry != null) { return entry.hostName; }
        throw new IllegalArgumentException("Entry not found");
    }

    private void validateEntry(String hostName, String hostIp) {
        if (getEntryByName(hostName) != null || getEntryByIp(hostIp) != null) {
            throw new IllegalArgumentException("Already exists");
        }
    }

    private DnsEntry getEntryByName(String hostName) {
        for (DnsEntry entry : entries) {
            if (entry.hostName.equals(hostName)) {
                return entry;
            }
        }
        return null;
    }

    private DnsEntry getEntryByIp(String hostIp) {
        for (DnsEntry entry : entries) {
            if (entry.hostIp.equals(hostIp)) {
                return entry;
            }
        }
        return null;
    }

    private static class DnsEntry {
        private final String hostName;
        private final String hostIp;

        public DnsEntry(String hostName, String hostIp) {
            this.hostName = hostName;
            this.hostIp = hostIp;
        }
    }
}
