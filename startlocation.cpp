uintptr_t L_1(DWORD process, const wchar_t* name) {
    HANDLE L_9 = CreateToolhelp32Snapshot(TH32CS_SNAPMODULE | TH32CS_SNAPMODULE32, process);

    if (L_9 == INVALID_HANDLE_VALUE) {
        return 0;
    }

    MODULEENTRY32 entry;
    entry.dwSize = sizeof(MODULEENTRY32);

    if (Module32First(L_9, &entry)) {
        do {

            if (!_wcsicmp(entry.szModule, name)) {
                CloseHandle(L_9); 
                return reinterpret_cast<uintptr_t>(entry.modBaseAddr);
            }
        } while (Module32Next(L_9, &entry));
    }

    CloseHandle(L_9);
    return 0;
}
